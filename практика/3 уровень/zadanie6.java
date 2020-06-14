import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;


public class zadanie6 {
	public static void main(String[] args) {
		boolean old = true;
		Set<Integer> arr1 = new HashSet<Integer>();
		Set<Integer> arr2 = new HashSet<Integer>();
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals(".")) {
					old = false;
					continue;
				}
			if (old) arr1.add(Integer.parseInt(args[i]));
			else arr2.add(Integer.parseInt(args[i]));
		}
		System.out.println(arr1.size() == arr2.size());
	}
}
