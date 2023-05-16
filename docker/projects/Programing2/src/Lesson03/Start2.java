package Lesson03;

import java.util.Random;

class Star2 {
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(3) + 1;

		System.out.print("頂きました。星");
		int i;
		for (i = 0; i < n; i++) {
			System.out.print("★");
		}
		for (; i < 3; i++) {
			System.out.print("☆");
		}
		System.out.println("つです。");
	}
}