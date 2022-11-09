public class Digit100e {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        // int n = Integer.parseInt(line);
        double n = Double.parseDouble(line);
        double k;  // 位の基数

        for (int i = 1; i <= 10; i++) {
            k = Math.pow(10,i);
            // System.out.println(" k:" + k);
            System.out.println(i + " 桁目の数字は " + (int)(n % k * 10 / k));
            // 
        }


    }
}
