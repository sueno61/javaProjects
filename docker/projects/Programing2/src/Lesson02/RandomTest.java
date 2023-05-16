package Lesson02;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt();

		System.out.println("n = " + n);
		if (n < 0)
			System.out.println("**** n < 0");
		System.out.println("End");
	}
}