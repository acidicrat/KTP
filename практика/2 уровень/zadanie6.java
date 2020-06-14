public class zadanie6 {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		System.out.println(fibb(number));
	}


	public static int fibb(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return fibb(number - 1) + fibb(number - 2);
	}
}
