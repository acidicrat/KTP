import java.util.*;


public class Slon {
	public static boolean canMove(String start, String end) {
		if (Board.exists(start) && Board.exists(end) && !start.equals(end)) {
			return Math.abs((int)start.charAt(1) - (int)end.charAt(1)) == Math.abs((int)start.charAt(0) - (int)end.charAt(0));
		}
		return false;
	}
}
