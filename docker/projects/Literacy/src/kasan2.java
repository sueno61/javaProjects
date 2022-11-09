public class kasan2 {
    public static void main(String[] args) {
		int i, n,wa;

		String N;		// 文字列型の変数 N を宣言する

		N = System.console().readLine("nまでの累計を計算します．n を入力してください： ");
		n = Integer.parseInt(N);

        wa = 0;
        for (i = 1; i <= n; i++) {
			wa += i;
		}
		
        System.out.println("1から" + n +  "までの累計: " + wa);
    }
}
