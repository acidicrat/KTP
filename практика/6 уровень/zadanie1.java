import java.util.*;


public class zadanie1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in array length: ");
		int number = Integer.parseInt(input.nextLine());
		System.out.printf("Bell's number is: %s\n", bell(number));
	}


	public static int bell(int number) {
		int[][] arr = new int[number + 1][number + 1];
		arr[0][0] = 1;
		for (int i = 1; i <= number; i++) {
			arr[i][0] = arr[i - 1][i - 1];
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i][j - 1];
			}
		}
		return arr[number][0];
	}
}
