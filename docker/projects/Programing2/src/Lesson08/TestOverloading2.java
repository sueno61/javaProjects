package Lesson08;

import java.util.Random;

public class TestOverloading2 {

	public static int max(int x1, int x2) {
		if (x1 > x2)
			return x1;
		return x2;
	}

	public static int max(int x1, int x2, int x3) {
		//		if (max(x1, x2) > x3)
		//			return max(x1, x2);
		//		return x3;
		return max(max(x1, x2), x3);
	}

	public static int max(int x1, int x2, int x3, int x4) {
		//		if (max(x1, x2, x3) > x4)
		//			return max(x1, x2, x3);
		//		return x4;
		return max(max(x1, x2, x3), x4);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 3; i++) {
			int a = rand.nextInt(100);
			int b = rand.nextInt(100);
			int c = rand.nextInt(100);
			int d = rand.nextInt(100);

			System.out.println("サンプル:" + a + ", " + b + ", " + c + ", " + d);
			System.out.println("max(" + a + ", " + b + ") = " + max(a, b));
			System.out.println("max(" + c + ", " + d + ") = " + max(c, d));
			System.out.println("max(" + a + ", " + b + ", " + c + ") = " + max(a, b, c));
			System.out.println("max(" + a + ", " + b + ", " + c + ", " + d + ") = " + max(a, b, c, d));
		}

	}

}
