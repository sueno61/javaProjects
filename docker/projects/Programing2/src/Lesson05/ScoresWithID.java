package Lesson05;

import java.util.Random;

public class ScoresWithID {

	public static void main(String[] args) {

		int[][] score = new int[80][3];
		char[] mark = new char[80];
		int[] def = new int[80];

		Random rand = new Random(); // seedなし
		for (int i = 0; i < score.length; i++) {
			score[i][0] = i + 1;
			score[i][1] = rand.nextInt(101);
			score[i][2] = rand.nextInt(101);
		}

		int wst = 100;
		int bst = 0;
		int wstInx = 0;
		int bstInx = 0;

		for (int i = 0; i < score.length; i++) {
			// wst = min(wst, score[i][1]);
			if (wst > score[i][1]) {
				wst = score[i][1];
				wstInx = i;
			}
			// bst = max(bst, score[i][2]);
			if (bst < score[i][2]) {
				bst = score[i][2];
				bstInx = i;
			}

			mark[i] = rank(score[i][1], score[i][2]);
			def[i] = subAbsolute(score[i][1], score[i][2]);
		}

		System.out.println("中間最低：" + wst + " (No." + score[wstInx][0] + ")");
		System.out.println("期末最高：" + bst + " (No." + score[bstInx][0] + ")");

		System.out.println(" No. 中  末  ランク(変動)");

		for (int i = 0; i < score.length; i++) {

			// System.out.print(score[i][0] + " " + score[i][1] + " " + score[i][2]);
			System.out.printf("%3d", score[i][0]);
			System.out.printf("%4d", score[i][1]);
			System.out.printf("%4d", score[i][2]);

			System.out.print("    " + mark[i]);
			System.out.printf("   %4d", def[i]);
			System.out.println();
		}

	}

	static int min(int x, int y) {
		int r = y;
		if (x < y) {
			r = x;
		}
		return r;
	}

	static int max(int x, int y) {
		int r = y;
		if (x > y) {
			r = x;
		}
		return r;
	}

	static double avrg(int x, int y) {
		return (x + y) / 2;
	}

	static char rank(int x, int y) {

		double avr = avrg(x, y);

		if (avr < 60) {
			return 'D';
		} else if (avr < 70) {
			return 'C';
		} else if (avr < 80) {
			return 'B';
		} else if (avr < 90) {
			return 'A';
		} else {
			return 'S';
		}
	}

	static int subAbsolute(int x, int y) {
		if (x > y) {
			return x - y;
		} else {
			return y - x;
		}
	}

}
