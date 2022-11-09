public class Tuika4b {
    public static void main(String[] args) {
        String line = System.console().readLine("d=");
        int d = Integer.parseInt(line);
        double r = Math.PI*d/180;
        System.out.printf("sin(%d°) = %f\n", d, Math.sin(r));
        System.out.printf("cos(%d°) = %f\n", d, Math.cos(r));
        System.out.printf("tan(%d°) = %f\n", d, Math.tan(r));
    }
}