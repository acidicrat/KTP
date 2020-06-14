public class zadanie7 {
	public static void main(String[] args) {
		String zip = args[0];
		System.out.println(isValid(zip));
	}


	public static boolean isValid(String zip) {
		if (zip.length() != 5) {
			return false;
		}
		try {
			int number = Integer.parseInt(zip);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
