package Lesson02;

import java.util.Random;

public class Min {

	public static void main(String[] args) {

		Random r = new Random();
		int m, n;

		m = r.nextInt();
		n = r.nextInt();

		System.out.println("m = " + m);
		System.out.println("n = " + n);

		if (m < n) {
			System.out.println("The minimum is " + m);
		} else {
			System.out.println("The minimum is " + n);
		}

	}

}
