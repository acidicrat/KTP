import java.util.*;


public class zadanie2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in word/sentence to translate: ");
		String word = input.nextLine();
		System.out.printf("Translate is: %s\n", translate(word));
	}


	public static String translate(String word) {
		String[] words = word.split(" ");
		String result = "";
		String vowels = "EeAaUuIiOoYy";
		String charactes = "!@#$%%^&*()<>,./?;:'\"[{}]_-+=";
		String stringStart = "";
		WORDS:
		for (String w: words) {
			for (char c: vowels.toCharArray()) {
				if (w.charAt(0) == c) {
					w += "yay";
					result += w + " ";
					continue WORDS;
				}
			}
			stringStart = "";
			CHARS:
			for (char c: w.toCharArray()) {
				for (char ch: vowels.toCharArray()) {
					if (c == ch) break CHARS;
				}
				stringStart += String.valueOf(c);
			}
			result += w.replace(stringStart, "") + stringStart + "ay" + " ";
			for (char c: w.toCharArray()) {
				for (char ch: charactes.toCharArray()) {
					if (c == ch) result = result.trim().replace(String.valueOf(c), "") + c + " ";
				}
			}
 		}
 		return result.trim();
	}
}
