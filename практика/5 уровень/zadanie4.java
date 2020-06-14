import java.util.*;


public class zadanie4 {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//String longword = input.nextLine();
		System.out.println(sumDigProd(args));
	}


	public static int sumDigProd(String... args) {
		int[] nums = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		int count = 0;
		int multi = 1;
		for (int num: nums) {
			count += num;
		}
		for (char c: String.valueOf(count).toCharArray()) {
			multi *= c - '0';
		}
		if (String.valueOf(multi).length() == 1) return multi;
		return sumDigProd(String.valueOf(multi));
	}
}
