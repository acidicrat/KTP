import java.util.*;


public class zadanie1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("N: ");
		int n = Integer.parseInt(input.nextLine());
		System.out.printf("K: ");
		int k = Integer.parseInt(input.nextLine());
		System.out.printf("String: ");
		String text = input.nextLine();
		System.out.println(essay(n, k, text));
	}


	public static String essay(int n, int k, String text) {
		String[] words = text.split(" ");
		String currentString = "";
		String result = "";
		boolean added = false;
		if (n > words.length) return "can't create essay with this parameters";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (currentString.replace(" ", "").length() + word.length() <= k) currentString += word + " ";
			else {
				result += currentString + "\n";
				currentString = word + " ";
			}
		}
		if (currentString.length() > 0) {
			result += currentString + "\n";
		}
		return result;
	}
}
