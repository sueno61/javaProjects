public class Digit100f {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);
        int d = 0;
        for (int i = 0; i < 10; i++) {
            if ((int)(n/Math.pow(10, i))>0) {
                d = i + 1;
            }
        }
        // System.out.println("n の桁数: " + d);

        int k;
        int m = 0;
        for (int i = 0; i < d; i++) {
            k = (int) Math.pow(10,i);
            // System.out.println(i + " 桁目の数字は " + (n/k)%10); 
            m = m + (n/k)%10 * (int)Math.pow(10,d-i-1);
        }
        
        System.out.println("m = " + m); 
        System.out.println("m*2 = " + m*2); 
    }
}
