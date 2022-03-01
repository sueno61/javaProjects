public class kasan3 {
    public static void main(String[] args) {
		int i, m, n, wa;

		String M, N;		// 文字列型の変数 N を宣言する

		M = System.console().readLine("mからnまでの累計を計算します。まず、m (from) を入力してください： ");
		m = Integer.parseInt(M);
		N = System.console().readLine("次にn (to) を入力してください： ");
		n = Integer.parseInt(N);

        wa = 0;
        for (i = m; i <= n; i++) {
			wa += i;
		}
		
        System.out.println(m + "から" + n +  "までの累計: " + wa);
    }
}
