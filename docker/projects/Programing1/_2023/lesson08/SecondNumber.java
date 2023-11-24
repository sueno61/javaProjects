public class SecondNumber {
    public static void main(String[] args) {
        String s;
        int max, second, n;

        s = System.console().readLine();
        n = Integer.parseInt(s);
        max = n;
        second = 0;

        s = System.console().readLine();
        n = Integer.parseInt(s);
        if (max < n) {
            second = max;
            max = n;
        } else if (second < n) {
            second = n;
        }

        s = System.console().readLine();
        n = Integer.parseInt(s);
        if (max < n) {
            second = max;
            max = n;
        } else if (second < n) {
            second = n;
        }

        s = System.console().readLine();
        n = Integer.parseInt(s);
        if (max < n) {
            second = max;
            max = n;
        } else if (second < n) {
            second = n;
        }

        System.out.println("2番目に大きい整数: " + second);
    }
}
