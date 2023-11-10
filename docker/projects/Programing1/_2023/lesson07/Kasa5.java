public class Kasa5 {
    public static void main(String[] args) {

        System.out.println("降水確率を入力してください。");
        String line = System.console().readLine();
        int n = Integer.parseInt(line);
        if (n < 0) {
            System.out.println("降水確率を0%に修正します。");
            n = 0;
        } else if (100 < n) {
            System.out.println("降水確率を100%に修正します。");
            n = 100;
        } else {
            System.out.println("降水確率は" + n + "%です。");
        }
        if (n >= 50) {
            System.out.println("傘を忘れずにね。");
        } else {
            System.out.println("傘はいりません。");
        }
        System.out.println("いってらっしゃい。");
    }
}
