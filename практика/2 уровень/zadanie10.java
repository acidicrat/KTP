public class zadanid10 {
	public static void main(String[] args) {
		System.out.println(boxSeq(Integer.parseInt(args[0])));
	}


	public static int boxSeq(int number) {
		if (number % 2 == 0) {
			return number;
		}
		return number + 2;
	}
}
