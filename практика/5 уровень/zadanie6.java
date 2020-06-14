import java.util.*;


public class zadanie6 {
	public static void main(String[] args) {
		System.out.println(validateCard(args[0]));
	}


	public static boolean validateCard(String card) {
		if (card.length() < 16 || card.length() > 19) return false;
		int checkNumber = Integer.parseInt(String.valueOf(card.charAt(card.length() - 1)));
		int longNumberSum = 0;
		int currentNumber = 0;
		int sum = 0;
		String sumString = "";
		for (int i = card.length() - 2; i >= 0; i--) {
			if (i % 2 == 0) currentNumber = Integer.parseInt(String.valueOf(card.charAt(i))) * 2;
			else currentNumber = Integer.parseInt(String.valueOf(card.charAt(i)));
			if (currentNumber > 9) {
				longNumberSum = 0;
				for (char c: String.valueOf(currentNumber).toCharArray()) {
					longNumberSum += Integer.parseInt(String.valueOf(c));
				}
				sum += longNumberSum;
				continue;
			}
			sum += currentNumber;
		}
		sumString = String.valueOf(sum);
		return (10 - Integer.parseInt(String.valueOf((sumString.charAt(sumString.length() - 1)))) == checkNumber);
	}
}
