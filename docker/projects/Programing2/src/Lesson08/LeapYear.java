package Lesson08;

import java.util.Random;

public class LeapYear {

	public static boolean isLeapYear(int y) {
		if (y % 4 != 0) {
			return false;
		} else if (y % 400 == 0) {
			return true;
		} else if (y % 100 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		//		int y = Integer.decode(args[0]);
		//
		//		if (isLeapYear(y)) {
		//			System.out.println(y + "年は、うるう年です");
		//		} else {
		//			System.out.println(y + "年は、うるう年ではありません");
		//		}

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {

			int y = 2000 + rand.nextInt(10) * 100;
			y = y + rand.nextInt(100);

			if (isLeapYear(y)) {
				System.out.println(y + "年は、うるう年です");
			} else {
				System.out.println(y + "年は、うるう年ではありません");
			}
		}
	}

}
