public class Digit100e2 {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);
        int k;  // 位の基数

        for (int i = 1; i <= 10; i++) {
            k = (int) Math.pow(10,i-1);
            System.out.println(i + " 桁目の数字は " + (n/k)%10); 
        }


    }
}
