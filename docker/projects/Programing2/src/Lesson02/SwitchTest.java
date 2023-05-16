package Lesson02;

import java.util.Random;

public class SwitchTest {
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(6);

		System.out.println("発生された数字： " + n);

		switch (n) {
		case 0:
			System.out.println("零");
			break;
		case 1:
			System.out.println("壱");
			break;
		case 2:
			System.out.println("弐");
			break;
		case 3:
			System.out.println("参");
			break;
		case 4:
			System.out.println("四");
			break;
		case 5:
			System.out.println("五");
			break;
		default:
			System.out.println("条件外");
			break;
		}

	}
}