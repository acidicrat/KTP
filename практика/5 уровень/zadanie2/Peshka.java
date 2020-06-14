import java.util.*;


public class Peshka {
	public static boolean canMove(String start, String end) {
		if (Board.exists(start) && Board.exists(end) && !start.equals(end)) {
			if (start.charAt(0) == end.charAt(0)) {
				if ((int)end.charAt(1) - (int)start.charAt(1) == 1) {
					return true;
				}
			}
		}
		return false;
	}
}
