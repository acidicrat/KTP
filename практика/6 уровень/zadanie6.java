import java.util.*;


public class zadanie6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Print in number: ");
		Integer number = Integer.parseInt(input.nextLine());
		System.out.println(ulam(number));
	}


	public static Integer ulam(Integer n) {
		List<Integer> ulams = new ArrayList<Integer>();
		ulams.add(1);
		ulams.add(2);
		int next = ulams.get(ulams.size() - 1) + 1;
		int count;
		while (ulams.size() != n) {
			count = 0;
			for (int i = 0; i < ulams.size() - 1; i++) {
				for (int j = i + 1; j < ulams.size(); j++) {
					if (ulams.get(i) + ulams.get(j) == next) count++;
					if (count > 1) break;
				}
				if (count > 1) break; 
			}
			if (count == 1) ulams.add(next);
			next++;
		}
		return ulams.get(n - 1);
	}
}
