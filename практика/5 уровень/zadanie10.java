import java.util.*;


public class zadanie10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in nubmer: ");
		int number = Integer.parseInt(input.nextLine());
		System.out.println("Result: ");
		System.out.println(hexLattice(number));
	}


	public static String hexLattice(int number) {
		if (number % 6 != 1) return "Invalid";
		if (number == 1) return "o";
		int levels = 1;
		int i = 0;
		String result = "";
		while (levels != number) {
			levels += 6 * i;
			i++;
		}
		for (int k = i; k <= 2 * i - 1; k++) {
			for (int j = k; j < 2 * i - 1; j++) {
				result += " ";
			}
			for (int j = 0; j < k; j++) {
				result += "o ";
			}
			result += "\n";
		}
		for (int k = 2 * i - 2; k >= i; k--) {
			for (int j = k; j < 2 * i - 1; j++) {
				result += " ";
			}
			for (int j = 0; j < k; j++) {
				result += "o ";
			}
			result += "\n";
		}
		return String.valueOf(result);
	}
}
