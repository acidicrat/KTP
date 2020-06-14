public class zadanie2 {
	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < args.length; i++) {
			s += args[i] + " ";
		}
		System.out.println(findZip(s));
	}


	public static int findZip(String s) {
		if (s.indexOf("zip") != -1 && s.lastIndexOf("zip") != s.indexOf("zip")) {
			return s.lastIndexOf("zip");
		}
		return -1;
	}
}
