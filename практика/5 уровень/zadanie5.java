import java.util.*;


public class zadanie5 {
	public static void main(String[] args) {
		System.out.println(sameVowelGroup(args));
	}


	public static List<String> sameVowelGroup(String[] args) {
		String[] allowed = new String[] {"A", "E", "Y", "U", "I", "O"};
		List<String> list = Arrays.asList(allowed);
		List<String> result = new ArrayList<String>();
		String first = args.length > 0 ? args[0] : "";
		boolean good = false;
		for (String str: args) {
			for (char f: first.toCharArray()) {
				if (list.contains(String.valueOf(f).toUpperCase())) {
					for (char s: str.toCharArray()) {
						if (s == f) {
							good = true;
							break;
						}
						good = false;
					}
				}
			}
			if (good) result.add(str);
		}
		return result;
	}
}
