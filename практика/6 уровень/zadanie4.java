import java.util.*;


public class zadanie4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in url: ");
		String url = input.nextLine();
		System.out.printf("Print in params separated by space: ");
		String[] params = input.nextLine().split(" ");
		if (params.length > 0) System.out.printf("Result is: %s\n", stripUrlParams(url, params));
		else System.out.printf("Result is: %s\n", stripUrlParams(url));
	}


	public static String stripUrlParams(String url, String... args) {
		String result = "";
		Map<String, String> params = new HashMap<String, String>();
		if (url.split("\\?").length == 1) return url;
		String[] urlparams = url.split("\\?")[1].split("\\&");
		PARAMS:
		for (String param: urlparams) {
			String key = param.split("\\=")[0];
			String value = param.split("\\=")[1];
			for (String arg: args) {
				if (arg.equals(key)) continue PARAMS;
			}
			params.put(key, value);
		}
		for (Map.Entry<String, String> entry: params.entrySet()) {
			result += entry.getKey() + "=" + entry.getValue() + " ";
		}
		return url.split("\\?")[0] + "?" + result.trim().replace(" ", "&");
	}
}
