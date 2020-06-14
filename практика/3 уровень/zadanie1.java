public class zadanie1 {
	public static void main(String[] args) {
		int[] Numbers = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			Numbers[i] = Integer.parseInt(args[i]);
		}
		System.out.println(solutions(Numbers[0], Numbers[1], Numbers[2]));
	}


	public static int solutions(int a, int b, int c) {
		double result = Math.pow(b, 2) - 4 * a * c;
		if (result > 0) {
			return 2;
		}
		else if (result == 0) {
			return 1;
		}
		return 0;
	}
}
