import java.util.*;


public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Start: ");
		String start = input.nextLine();
		System.out.printf("End: ");
		String end = input.nextLine();
		System.out.println(Ferz.canMove(start, end));
	}
}
