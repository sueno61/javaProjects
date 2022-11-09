public class Kasa4 {
    public static void main(String[] args) {

        System.out.println("降水確率を入力してください。");
        String line = System.console().readLine();
        int n = Integer.parseInt(line);
        System.out.println("降水確率は" + n + "%です。");
        if (n < 0 || 100 < n) {
            System.out.println("降水確率は 0 〜 100 の間ですよ。");
        } else if (n >= 50) {
            System.out.println("傘を忘れずにね。");
        } else if (n >= 30) {
            System.out.println("傘を持っていった方がいいかもね。");
        } else {
            System.out.println("傘はいりません。");
        }
        System.out.println("いってらっしゃい。");
    }
}
