public class zadanie10 {
	public static void main(String[] args) {
		int[] Args = new int[args.length];
		for (int i = 0; i < Args.length; i++) {
			Args[i] = Integer.parseInt(args[i]);
		}
		System.out.println(abcmath(Args[0], Args[1], Args[2]));
	}


	public static boolean abcmath(int x, int y, int z) {
		for (int i = 0; i < y; i++) {
			x += x;
		}
		return (x % z == 0);
	}
}
