import java.lang.Exception;
import java.util.*;
import java.net.MalformedURLException;
import java.net.*;
import java.io.*;

public class Crawler {

    public static final int HTTP_PORT = 80;
    public static final String HOOK_REF = "<a href=\"";
    public static final String BAD_REQUEST_LINE = "HTTP/1.1 400 Bad Request";
    public static final int NUM_OF_DEFAULT_THREADS = 4;


    public static final String testURL = "http://users.cms.caltech.edu/~donnie/cs11/java/";
    public static final int testDepth = 1;

    public int depth;

    public int numOfThreads;

    public Crawler() {

    }

    public static void main (String[] args) {

        Crawler crawler = new Crawler();

        crawler.numOfThreads = Crawler.NUM_OF_DEFAULT_THREADS;

        URLDepthPair firstRezAndSetDepth = crawler.getFirstURLDepthPair(args);
        crawler.numOfThreads = CrawlerHelper.getNumOfThreads(args);

        URLPool pool = new URLPool(crawler.depth);
        pool.put(firstRezAndSetDepth);

        int totalThreads = 0;
        int initialActive = Thread.activeCount();

        while (pool.getWaitThreads() != crawler.numOfThreads) {

            //System.out.println("Wait threads = " + pool.getWaitThreads() + "\n");

            if (Thread.activeCount() - initialActive < crawler.numOfThreads) {
                CrawlerTask crawlerTask = new CrawlerTask(pool);
                new Thread(crawlerTask).start();
            }
            else {
                try {
                    Thread.sleep(100);  // 0.1 second
                }
                // Catch InterruptedException.
                catch (InterruptedException ie) {
                    System.out.println("Caught: unexpected InterruptedException, ignoring...");
                }

            }
        }

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("----------Progs work end-----------");
        System.out.println("-----------Rezults:----------------");
        System.out.println("-----------------------------------");

        LinkedList<URLDepthPair> list = pool.getWatchedList();
        System.out.println("Watched pages:");
        int count = 1;
        for (URLDepthPair page : list) {
            System.out.println(count + " |  " + page.toString());
            count += 1;
        }

        list = pool.getBlockedList();
        System.out.println("\nPages that have not been parsed:");
        count = 1;
        for (URLDepthPair page : list) {
            System.out.println(count + " |  " + page.toString());
            count += 1;
        }

        System.out.println("-----------------------------------");
        System.out.println("----------End of rezults-----------");
        System.out.println("-----------End of prog-------------");
        System.out.println("-----------------------------------");

        System.exit(0);

    }

    public static void createURlDepthPairObject(String url, int depth, LinkedList<URLDepthPair> listOfUrl) {
        URLDepthPair newURL = null;
        try{
            newURL = new URLDepthPair(url, depth);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        listOfUrl.addLast(newURL);
    }

    public URLDepthPair getFirstURLDepthPair(String[] args) {
        CrawlerHelper help = new CrawlerHelper();

        URLDepthPair urlDepth = help.getURLDepthPairFromArgs(args);
        if (urlDepth == null) {
            System.out.println("Args are empty or have exception. Now you need to enter URL and depth manually!\n");

            urlDepth = help.getURLDepthPairFromInput();
        }

        this.depth = urlDepth.getDepth();
        urlDepth.setDepth(0);


        return(urlDepth);

        //System.out.println("First site: " + urlDepth.toString() + "\n");
    }


    public static LinkedList<URLDepthPair> parsePage(URLDepthPair element) {
        LinkedList<URLDepthPair> listOfUrl = new LinkedList<URLDepthPair>();

        Socket socket = null;

        try {
            //System.out.println("Trying to connect to " + nowPage.getHostName());
            socket = new Socket(element.getHostName(), HTTP_PORT);
            //System.out.println("Connection to [ " + element.getURL() + " ] created!");

            try {
                socket.setSoTimeout(5000);
            }
            catch (SocketException exc) {
                System.err.println("SocketException: " + exc.getMessage());
                return null;
            }

            //CrawlerHelper.getInfoAboutUrl(element.getURL(), true);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("GET " + element.getPagePath() + " HTTP/1.1");
            out.println("Host: " + element.getHostName());
            out.println("Connection: close");
            out.println("");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = in.readLine();

            if (line.startsWith(BAD_REQUEST_LINE)) {
                //System.out.println("ERROR: BAD REQUEST!");
                System.out.println(line + "\n");
                return null;
            }
            //System.out.println("REQUEST IS GOOD!\n");
            //System.out.println("---Start of file---");
            int strCount = 0;
            //int strCount2 = 0;
            while(line != null) {
                try {
                    line = in.readLine();
                    strCount += 1;

                    String url = CrawlerHelper.getURLFromHTMLTag(line);
                    if (url == null) continue;

                    if (url.startsWith("https://")) {
                        //System.out.println(strCount + " |  " + url + " --> https-refference\n");
                        continue;
                    }

                    if (url.startsWith("../")) {
                        String newUrl = CrawlerHelper.urlFromBackRef(element.getURL(), url);
                        //System.out.println(strCount + " |  " + url + " --> " +  newUrl + "\n");
                        Crawler.createURlDepthPairObject(newUrl, element.getDepth() + 1, listOfUrl);
                    }

                    else if (url.startsWith("http://")) {
                        String newUrl = CrawlerHelper.cutTrashAfterFormat(url);
                        //System.out.println(strCount + " |  " + url + " --> " + newUrl + "\n");
                        Crawler.createURlDepthPairObject(newUrl, element.getDepth() + 1, listOfUrl);
                    }

                    else {
                        String newUrl;
                        newUrl = CrawlerHelper.cutURLEndFormat(element.getURL()) + url;
                        //System.out.println(strCount + " |  " + url + " --> " + newUrl + "\n");
                        Crawler.createURlDepthPairObject(newUrl, element.getDepth() + 1, listOfUrl);
                    }

                    //strCount2 += 1;
                }
                catch (Exception e) {
                    break;
                }
            }

            if (strCount == 1) {
                System.out.println("No http refs in this page!");
                return null;
            }
            //System.out.println("---End of file---\n");
            //System.out.println("Page had been closed\n");

        }
        catch (UnknownHostException e) {
            System.out.println("Opps, UnknownHostException catched, so [" + element.getURL() + "] is not workable now!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return listOfUrl;
    }

    public static void showResults(URLDepthPair element, LinkedList<URLDepthPair> listOfUrl) {
        System.out.println("---Rezults of working---");
        System.out.println("Origin page: " + element.getURL());

        System.out.println("Pages that were founded:");
        int count = 1;
        for (URLDepthPair pair : listOfUrl) {
            System.out.println(count + " |  " + pair.toString());
            count += 1;
        }
        System.out.println("-----End of rezults-----");
        System.out.println("");
    }

}