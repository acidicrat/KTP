public class zadanie7 {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		System.out.println(addUpTo(number));
	}


	public static int addUpTo(int number) {
		int result = 0;
		for (int i = 1; i <= number; i++) {
			result += i;
		}
		return result;
	}
}
