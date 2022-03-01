package Lesson08;

import java.util.Random;

public class TestOverloading {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			int a = rand.nextInt(100);
			int b = rand.nextInt(100);
			int c = rand.nextInt(100);

			System.out.println("min(" + a + ", " + b + ", " + c + ") = " + min(a, b, c));
		}
	}

	public static int min(int x1, int x2) {
		if (x1 < x2)
			return x1;
		return x2;
	}

	public static int min(int x1, int x2, int x3) {
		if (min(x1, x2) < x3)
			return min(x1, x2);
		return x3;
	}

}
