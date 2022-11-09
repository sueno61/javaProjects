public class Factorial {

	public static void main(String[] args) {
		
		String N = System.console().readLine("n!を計算します。nを入力してください：");
		int n = Integer.parseInt(N);

		System.out.println("\n" + n + "の階乗：");

		System.out.println(f(n) + "（float）");
		System.out.println((int)f(n) + "(floatをintに型変換) ");
		System.out.println(fi(n) + "(intで階乗計算) ");
		System.out.println(fl(n) + "(longで階乗計算) ");

	}

	static float f(int n) {
		if (n < 2)
			return 1;
		return n * f(n - 1);
	}

	static int fi(int n) {
		if (n < 2)
			return 1;
		return n * fi(n - 1);
	}

	static long fl(int n) {
		if (n < 2)
			return 1;
		return n * fl(n - 1);
	}

}
