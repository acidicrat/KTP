import java.util.*;


public class zadanie7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in string: ");
		String string = input.nextLine();
		System.out.println(longestNonrepeatingSubstring(string));
	}


	public static String longestNonrepeatingSubstring(String string) {
		ArrayList<String> uniques = new ArrayList<String>();
		String currentString = "";
		String currentChar;
		int indexMax = 0;
		for (char c: string.toCharArray()) {
			currentChar = String.valueOf(c);
			if (currentString.indexOf(currentChar) != -1) {
				uniques.add(currentString);
				currentString = currentChar;
				continue;
			}
			currentString += currentChar;
		}
		if (currentString.length() != 0) uniques.add(currentString);
		for (int i = 0; i < uniques.size(); i++) {
			if (uniques.get(indexMax).length() < uniques.get(i).length()) {
				indexMax = i;
			}
		}
		return uniques.get(indexMax);
	}
}
