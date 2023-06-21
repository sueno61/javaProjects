public class Handan {
	public static void main(String[] args) {
		int ransu;

		ransu = (int) (Math.random() * 100); // 0 から 100 未満の乱数
		// Math.random() : 0 以上 1 未満（ [0,1) ）の範囲で疑似乱数を返す

		System.out.print("\n乱数の値：" + ransu);
		// " " 内の文字列と変数 ransu の値を連結して出力する
		if ((ransu % 2) == 0) {
			// if：( ) 内に記した論理式を判断して，真ならば { } 内を実行する
			// 偽ならば else 内を実行する
			// %：余りを求める演算子，==：左辺と右辺が等しいかどうか判断
			// 余りが 0 は偶数を表す，それ以外( 1 )は奇数を表す
			System.out.println("　⇒偶数です。");
		} else {
			System.out.println("　⇒奇数です。");
		}
	}

}
