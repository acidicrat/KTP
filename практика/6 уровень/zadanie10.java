import java.util.*;


public class zadanie10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in number: ");
		int number = Integer.parseInt(input.nextLine());
		System.out.println(palindromedescendant(number));
	}


	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i > -1; i--) {
			result += str.charAt(i);
		}
		return result;
	}


	public static boolean palindromedescendant(int number) {
		String numberString = String.valueOf(number);
		String newNumber = "";
		int value;
		System.out.printf("normal: %s, reversed: %s\n", numberString, reverseString(numberString));
		if (number < 10) return false;
		if (numberString.equals(reverseString(numberString))) return true;
		for (int i = 0; i < numberString.length(); i += 2) {
			value = 0;
			value += Integer.parseInt(String.valueOf(numberString.charAt(i)));
			value += Integer.parseInt(String.valueOf(numberString.charAt(i + 1)));
			newNumber += String.valueOf(value);
		}
		return palindromedescendant(Integer.parseInt(newNumber));
	}
}
