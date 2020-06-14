public class zadanie9 {
	public static void main(String[] args) {
		if (Character.toString(args[1].charAt(0)).equals("-")){
			System.out.println(isSuffix(args[0], args[1]));
		}
		else {
			System.out.println(isPrefix(args[0], args[1]));
		}
	}


	public static boolean isPrefix(String first, String second) {
		second = second.replace("-", "");
		for (int i = 0; i < second.length(); i++) {;
			if (second.charAt(i) == first.charAt(i)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}


	public static boolean isSuffix(String first, String second) {
		second = second.replace("-", "");
		int diff = first.length() - second.length();
		for (int i = diff; i < first.length(); i++) {
			if (second.charAt(i - diff) == first.charAt(i)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
