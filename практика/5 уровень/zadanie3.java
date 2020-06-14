import java.util.*;


public class zadanie3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Shortcut: ");
		String shortword = input.nextLine();
		System.out.printf("Word: ");
		String longword = input.nextLine();
		System.out.println(canComplete(shortword, longword));
	}


	public static boolean canComplete(String shortword, String longword) {
		boolean exists = false;
		for (char c: shortword.toCharArray()) {
			exists = false;
			for (int i = 0; i < longword.length(); i++) {
				if (c == longword.charAt(i)) {
					longword = longword.substring(i + 1);
					exists = true;
					break;
				}
			}
			if (exists == false) return false;
		}
		return true;
	}
}
