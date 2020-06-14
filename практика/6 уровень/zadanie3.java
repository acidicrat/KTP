import java.util.regex.*;
import java.util.*;


public class zadanie3 {
	public static String rgb = "rgb\\(([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\)";
	public static String rgba = "rgba\\(([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,[0-1]\\)";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in rgb/rgba: ");
		String color = input.nextLine();
		System.out.printf("Result is: %s\n", validColor(color));
	}


	public static boolean validColor(String color) {
		if (Pattern.matches(rgb, color)) return true;
		if (Pattern.matches(rgba, color)) return true;
		return false;
	}
}
