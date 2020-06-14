import java.util.*;


public class zadanie6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Number: ");
		Integer number = Integer.parseInt(input.nextLine());
		System.out.println(bugger(number));
	}


	public static int bugger(int n) {
		String value = String.valueOf(n);
		int count = 0;
		int result = 1;
		while (value.length() != 1) {
			for (int i = 0; i < value.length(); i++) {;
				result *= Integer.parseInt(String.valueOf(value.charAt(i)));
			}
			count++;
			value = String.valueOf(result);
			result = 1;
		}
		return count;
	}
}
