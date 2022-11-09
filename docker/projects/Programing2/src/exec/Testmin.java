package exec;

import java.util.Random;

public class Testmin {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			int m = rand.nextInt(100);
			int n = rand.nextInt(100);
			int y = min(m, n);

			System.out.println("min(" + m + ", " + n + ") = " + y);
		}
	}

	static int min(int x, int y) {
		int r = y;
		if (x < y) {
			r = x;
		}
		return r;

		//		if (x < y) {
		//			return x;
		//		} else {
		//			return y;
		//		}
	}

}
