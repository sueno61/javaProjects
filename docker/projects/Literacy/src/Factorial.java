import java.math.BigDecimal;

public class Factorial {
	public static void main(String[] args) {
		int i, n, kaijoi;
		double kaijo;

		String N; // 文字列型の変数 N を宣言する

		N = System.console().readLine("n! を計算します．n を入力してください： ");
		// キーボードから文字列を読み込む，
		// " " 内の文字列を表示する
		n = Integer.parseInt(N);
		// 読み込んだ文字列を整数値に変換する
		kaijo = 1; // 初期値(乗算の単位元)
		kaijoi = 1;

		System.out.println("\n階乗の計算：");
		// 1 から n まで乗算，kaijo の初期値は２行前で設定
		for (i = 1; i <= n; i = i + 1) {
			kaijo = kaijo * i;
			kaijoi = kaijoi * i;
		}
		System.out.println(n + "! = " + kaijo + " (double)");
		System.out.println(n + "! = " + BigDecimal.valueOf(kaijo).toPlainString());

		System.out.println(n + "! = " + kaijoi + " (int)");
	}

}
