public class zadanie9 {
	public static void main(String[] args) {
		int[] Args = new int[args.length];
		for (int i = 0; i < Args.length; i++) {
			Args[i] = Integer.parseInt(args[i]);
		}
		System.out.println(sumOfCubes(Args));
	}


	public static int sumOfCubes(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += Math.pow(arr[i], 3);
		}
		return result;
	}
}
