public class zadanie4 {
	public static void main(String[] args) {
		int[] Numbers = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			Numbers[i] = Integer.parseInt(args[i]);
		}
		System.out.println(cumaltiveSum(Numbers));
	}


	public static String cumaltiveSum(int[] arr) {
		String answer = " ";
		for (int i = 0; i < arr.length; i++) {
			int result = arr[i];
			for (int j = 0; j < i; j++) {
				result += arr[j];
			}
			answer += result + " ";
		}
		return answer;
	}
}
