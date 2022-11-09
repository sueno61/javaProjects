public class NumOfDigits {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);
        int d = 0;
        for (int i = 0; i < 10; i++) {
            if ((int)(n/Math.pow(10, i))>0) {
                d = i + 1;
            }
        }
        System.out.println("n の桁数: " + d);
    }
}
