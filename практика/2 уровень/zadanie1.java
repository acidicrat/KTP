ublic class zadanie1
{
	public static void main(String[] args) {
		String str = args[0];
		int repeats = Integer.parseInt(args[1]);
		System.out.println(repeat(str, repeats));
	}


	public static String repeat(String str, int repeats) {
		String result = " ";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < repeats; j++) {
				result += str.charAt(i);
			}
		}
		return result;
	}
}
