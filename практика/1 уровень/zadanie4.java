public class zadanie4
{
	public static void main(String[] args) {
		double[] Args = new double[3];
		for (int i = 0; i < args.length; i++) {
			Args[i] = Double.parseDouble(args[i]);
		}
		System.out.println(triArea(Args[0], Args[1], Args[2]));
	}


	public static boolean triArea(double x, double y, double z)
	{
		return x * y > z;
	}
}
