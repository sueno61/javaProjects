package Lesson02;

import java.util.Random;

public class EvenOddTest {
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt();

		System.out.println("n = " + n);
		if (n % 2 == 0) {
			System.out.println("nは偶数です");
		} else {
			System.out.println("nは奇数です");
		}
	}
}