import java.util.*;
import java.util.regex.*;


public class zadanie5 {
	public static Pattern textPattern = Pattern.compile("[a-zA-Z]+");
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in text: ");
		String text = input.nextLine();
		List<String> hashtags = getHashTags(text);
		for (String hashtag: hashtags) {
			System.out.println(hashtag);
		}
	}


	public static List<String> getHashTags(String text) {
		List<String> result = new ArrayList<String>();
		Matcher matcher;
		String maximumWord = "";
		int indexMax = -1;
		int i = 0;
		List<String> hashtags = new ArrayList<String>();
		matcher = textPattern.matcher(text);
		while (matcher.find()) {
			hashtags.add(matcher.group().toLowerCase());
		}
		System.out.println(hashtags);
		while (i < 3 && hashtags.size() != 0) {
			maximumWord = "";
			for (int j = 0; j < hashtags.size(); j++) {
				if (hashtags.get(j).length() > maximumWord.length()) {
					maximumWord = hashtags.get(j);
					indexMax = j;
				}
			}
			hashtags.remove(indexMax);
			result.add("#" + maximumWord);
			i++;
		}
		return result;
	}
}
