public class Tax10b {
    public static void main(String[] args) {
        int p = 228;

        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);
        System.out.printf("1個 %d 円のリンゴを %d 個購入するときの税込み金額は ", p, n);
        System.out.println((int)(p*n*1.1) + " 円です。");

    }
}