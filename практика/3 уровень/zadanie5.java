import java.util.Arrays;
import java.util.List;

public class zadanie5 {
	public static void main(String[] args) {
		System.out.println(isValidHex(args[0]));
	}


	public static boolean isValidHex(String s) {
		String[] allowed = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "A", "B", "C", "D", "E", "F"};
		List<String> list = Arrays.asList(allowed);
		if (s.length() != 7 || Character.toString(s.charAt(0)) != "#") {
			return false;
		}
		for (int i = 1; i < s.length(); i++) {
			if (list.contains(Character.toString(s.charAt(i)).toUpperCase())) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
