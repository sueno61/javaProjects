package Lesson02;

import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		Random rand = new Random();
		double r = rand.nextDouble();

		if (0 <= r && r < 0.25) {
			System.out.println("0 <= " + r + " < 1/4");
		} else if (0.25 <= r && r < 0.5) {
			System.out.println("1/4 <= " + r + " < 1/2");
		} else if (0.5 <= r && r < 0.75) {
			System.out.println("1/2 <= " + r + " < 3/4");
		} else if (0.75 <= r && r < 1) {
			System.out.println("3/4 <= " + r + " < 1");
		}

		//		if (0 <= r && r < 0.25) {
		//			System.out.println("0 <= " + r + " < 1/4");
		//		} else {
		//			if (0.25 <= r && r < 0.5) {
		//				System.out.println("1/4 <= " + r + " < 1/2");
		//			} else {
		//				if (0.5 <= r && r < 0.75) {
		//					System.out.println("1/2 <= " + r + " < 3/4");
		//				} else {
		//					if (0.75 <= r && r < 1) {
		//						System.out.println("3/4 <= " + r + " < 1");
		//					}
		//				}
		//			}
		//		}

	}
}
