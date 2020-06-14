public class zadanie2
{
	public static void main(String[] args) {
		int[] Args = new int[2];
		for (int i = 0; i < args.length; i++) {
			Args[i] = Integer.parseInt(args[i]);
		}
		System.out.println(triArea(Args[0], Args[1]));
	}


	public static double triArea(int x, int y)
	{
		return x * y / 2;
	}
}
