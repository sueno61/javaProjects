public class Translate {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);

        if (n == 0) {
            line = "zero";
        } else if (n == 1) {
            line = "one";
        } else if (n == 2) {
            line = "two";
        } else if (n == 3) {
            line = "three";
        } else if (n == 4) {
            line = "four";
        } else if (n == 5) {
            line = "five";
        } else if (n == 6) {
            line = "six";
        } else if (n == 7) {
            line = "seven";
        } else if (n == 8) {
            line = "eight";
        } else if (n == 9) {
            line = "nine";
        } else {
            line = "unknown";
        }

        System.out.println(line);
        
    }
}
