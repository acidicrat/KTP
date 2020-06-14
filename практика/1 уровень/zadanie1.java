public class zadanie1 {
	public static void main(String[] args) {
		int[] Args = new int[2];
		for (int i = 0; i < args.length; i++) {
			Args[i] = Integer.parseInt(args[i]);
		}
		System.out.println(remainder(Args[0], Args[1]));
	}


	public static int remainder(int x, int y)
	{
		return x % y;
	}
}
