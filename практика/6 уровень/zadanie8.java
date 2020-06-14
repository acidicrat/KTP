import java.util.*;


public class zadanie8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in number: ");
		int number = Integer.parseInt(input.nextLine());
		System.out.println(convertToRoman(number));
	}


	public static String convertToRoman(int number) {
		String[] belowTen = new String[] {"" /*0*/, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] hunderedToThousand = new String[] {"" /*0*/, "С", "СС", "ССС", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] tenToHundered = new String[] {"" /*0*/, "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String result = "";
		if (number > 3999) return "This number is too big... sorry......";
		if (number > 999) {
			for (int i = 0; i < number / 1000; i++) result += "M";
			number = number % 1000;
		}
		if (number / 100 > 0) {
			result += hunderedToThousand[number / 100];
			number = number % 100;
		}
		if (number / 10 > 0) {
			result += tenToHundered[number / 10];
			number = number % 10;
		}
		if (number > 0) result += belowTen[number];
		return result;
	}
}
