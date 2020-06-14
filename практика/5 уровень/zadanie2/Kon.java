import java.util.*;


public class Kon {
	public static boolean canMove(String start, String end) {
		if (Board.exists(start) && Board.exists(end) && !start.equals(end)) {
			// Берется разница в числах между началом и концом
			int diff = (int)start.charAt(1) - (int)end.charAt(1);
			// Проверяется, отличаются ли буквы начала и конца 
			boolean equal = start.charAt(0) != end.charAt(0);
			if (Math.abs(diff) <= 2 && diff != 0 && equal) {
				if (Math.abs(diff) == 2) {
					if (Math.abs(((int)start.charAt(0) - (int)end.charAt(0))) == 1) {
						return true;
					}
				}
				else {
					if (Math.abs(((int)start.charAt(0) - (int)end.charAt(0))) == 2) {
						return true;
					}
				}
			}
		}
		System.out.printf("Kon can't move from %s to %s\n", start, end);
		return false;
	}
}
