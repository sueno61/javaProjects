package Lesson02;

import java.util.Random;

public class Min2 {

	public static void main(String[] args) {

		Random r = new Random();
		int m, n, min;

		m = r.nextInt();
		n = r.nextInt();

		System.out.println("m = " + m);
		System.out.println("n = " + n);

		min = m < n ? m : n;
		System.out.println("The minimum is " + min);

	}
}
