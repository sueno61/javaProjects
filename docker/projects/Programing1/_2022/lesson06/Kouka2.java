public class Kouka2 {
    public static void main(String[] args) {
        String line;
        int m, c500, c100, c50, c10, c5, c1;
        System.out.println("金額を入力してください。");
        line = System.console().readLine();
        m = Integer.parseInt(line);

        if (m < 0) {
            System.out.println("エラー：0 以上の整数を入力してください。");
        } else {
            
            c500 = m / 500;
            m = m % 500;
            c100 = m /100;
            m = m % 100;
            c50 = m / 50;
            m = m % 50;
            c10 = m / 10;
            m = m % 10;
            c5 = m / 5;
            c1 = m % 5;
            
            System.out.printf("500円硬貨%d枚、", c500);
            System.out.printf("100円硬貨%d枚、", c100);
            System.out.printf("50円硬貨%d枚、", c50);
            System.out.printf("10円硬貨%d枚、", c10);
            System.out.printf("5円硬貨%d枚、", c5);
            System.out.printf("1円硬貨%d枚です。\n", c1);
        }

    }
}
