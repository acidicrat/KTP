import java.util.Arrays;
import java.util.List;


public class zadanie7 {
	public static void main(String[] args) {
		System.out.println(isKaprekar(Integer.parseInt(args[0])));
	}


	public static boolean isKaprekar(int x) {
		String result = String.valueOf((int)Math.pow(x, 2));
		int num1;
		int num2;
		if (result.length() == 1) num1 = 0;
		else num1 = Integer.parseInt(result.substring(0, (int)(result.length() / 2)));
		num2 = Integer.parseInt(result.substring((int)(result.length() / 2)));
		System.out.printf("%s, %s \n", num1, num2);
		return (num1 + num2 == x);
	}
}
