public class zadanie8 {
	public static void main(String[] args) {
		int[] Args = new int[2];
		for (int i = 0; i < Args.length; i++) {
			Args[i] = Integer.parseInt(args[i]);
		}
		System.out.println(nextEdge(Args[0], Args[1]));
	}


	public static int nextEdge(int x, int y) {
		return x + y - 1;
	}
}
