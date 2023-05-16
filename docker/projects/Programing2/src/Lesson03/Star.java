package Lesson03;

import java.util.Random;

class Star {
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(3) + 1;

		System.out.print("頂きました。星");
		for (int i = 0; i < n; i++) {
			System.out.print("★");
		}
		System.out.println("つです。");
	}
}
