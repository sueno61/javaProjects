public class Urudosi {
    public static void main(String[] args) {
        String line = System.console().readLine("西暦を入力してください。");
        int n = Integer.parseInt(line);

        if (n % 400 == 0) {
            System.out.println("うるう年です。");
        } else if (n % 100 != 0 && n % 4 ==0) {
            System.out.println("うるう年です。");
        } else {
            System.out.println("うるう年ではありません。");
        }
    }
}
