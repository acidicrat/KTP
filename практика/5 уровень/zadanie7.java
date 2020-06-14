import java.util.*;


public class zadanie7 {
	public static void main(String[] args) {
		System.out.println(numToEng(Integer.parseInt(args[0])));
	}


	public static String numToEng(int num) {
		if (num == 0) return "zero";
		String result = "";
		String[] firstNumbers = new String[] {"", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] secondNumbers = new String[] {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
        };
        if (num < 20) {
        	result = firstNumbers[num];
        }
        else if (num < 100) {
        	result = secondNumbers[num / 10] + (num % 10 != 0 ? " ": "") + firstNumbers[num % 10];
        }
        else if (num < 1000) {
        	result = firstNumbers[num / 100] + " hundered " + (num % 100 != 0 ? numToEng(num % 100) : "");
        }
        return result;
	}
}
