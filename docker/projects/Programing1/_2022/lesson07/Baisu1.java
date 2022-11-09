public class Baisu1 {
    public static void main(String[] args) {
        String s;
        int n;
        s = System.console().readLine("6桁のユーザIDを入力せよ。");
        n = Integer.parseInt(s);
        if (n%2==0 && n%3==0) {
            System.out.println("2と3の両方の倍数です。");
        } else {
            if (n%2==0 || n%3==0) {
                System.out.println("2と3の片方の倍数です。");
            } else {
                System.out.println("どちらの倍数でもありません。");
            }
        }
    }
}
