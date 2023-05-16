package Lesson02;

class Sanko2 {
	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		//		int ans = x < y ? x : y;
		//		System.out.println("ans = " + ans);

		System.out.printf("input1: %d / input2: %d%n", x, y);
		System.out.println("min = " + (x < y ? x : y));
	}
}