import java.util.*;

public class zadanie10 {
	public static void main(String[] args) {
		System.out.println(rightTri(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
	}

	public static boolean rightTri(int x, int y, int z) {
		int[] arr = {x, y, z};
		Arrays.sort(arr);
		return (Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == arr[2]);
	}
}
