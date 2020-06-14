public class zadanie5
{
	public static void main(String[] args) {
		double[] Args = new double[3];
		for (int i = 0; i < args.length; i++) {
			Args[i] = Double.parseDouble(args[i]);
		}
		System.out.println(triArea(Args[0], Args[1], Args[2]));
	}


	public static String triArea(double x, double y, double z) {
		if (x + y == z) {
			return "сложение";
		} 
		if (x - y == z) {
			return "вычетание";
		}
		if (x * y == z) {
			return "умножение";
		}
		if (x / y == z) {
			return "деление";
		}
		return null;
	}
}
