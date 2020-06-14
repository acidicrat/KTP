import java.util.*;


public class Board {
	public static String[] arr = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
	public static Set<String> set = new HashSet<String>(Arrays.asList(arr));

	public static boolean exists(String coordinate) {
		if (set.contains(String.valueOf(coordinate.charAt(0))) == true && coordinate.charAt(1) - '0' > 0 && coordinate.charAt(1) - '0' < 9) return true;
		return false;
	}


}
