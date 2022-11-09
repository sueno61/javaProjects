public class Omikuji {
    public static void main(String[] args) {
        int n = (int)(Math.random()*10);
        // System.out.println(n);
        String s;
        if (n < 1) {
            s = "大吉";  // 0
        } else if (n < 4) {
            s = "中吉";  // 1,2,3
        } else if (n < 8) {
            s = "小吉";  // 4,5,6,7
        } else {
            s = "末吉";  // 8,9
        }

        System.out.println(s + "が出ました。");
    }
}
