public class zadanie3 {
	public static void main(String[] args) {
		int[] Numbers = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			Numbers[i] = Integer.parseInt(args[i]);
		}
		System.out.println(isAvgWhole(Numbers));
	}


	public static boolean isAvgWhole(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return (result % arr.length == 0); 
	}
}
