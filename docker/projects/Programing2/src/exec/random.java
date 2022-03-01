package exec;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		Random r = new Random();

		for (int cnt = 0; cnt < 3; cnt++) {
			int n = r.nextInt();
			System.out.println(cnt + 1 + "回目");
			System.out.println("n = " + n);
			if (n < 0)
				System.out.println("**** n < 0");
			System.out.println("End");

		}

	}

}
