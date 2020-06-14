public class zadanie3 {
	public static void main(String[] args) {
		int[] Args = new int[3];
		for (int i = 0; i < args.length; i++) {
			Args[i] = Integer.parseInt(args[i]);
		}
		System.out.println(triArea(Args[0], Args[1], Args[2]));
	}


	public static double triArea(int x, int y, int z)
	{
		return x * 2 + y * 4 + z * 4;
	}
}
