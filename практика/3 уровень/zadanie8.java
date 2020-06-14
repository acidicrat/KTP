public class zadanie8 {
	public static void main(String[] args) {
		System.out.println(lognestZero(args[0]));
	}


	public static String lognestZero(String s) {
		int count = 0;
		int temp = 0;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			System.out.printf("count: %s, temp: %s, i: %s \n", count, temp, i);
			if (Character.toString(s.charAt(i)).equals("0")) temp++;
			else temp = 0;
			if (temp > count) count=temp;
		}
		for (int i = 0; i < count; i++) result += "0";
		return result;
	}
}
