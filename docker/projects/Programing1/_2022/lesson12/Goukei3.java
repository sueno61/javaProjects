public class Goukei3 {
    public static void main(String[] args) {
        String s = System.console().readLine("n = ");
        int n = Integer.parseInt(s);
        int[] ns = new int[n];

        for (int i = 0; i < n; i++) {
            s = System.console().readLine();
            ns[i] = Integer.parseInt(s);
        }

        int sum = ns[0];
        System.out.print(ns[0]);
        for (int i = 1; i < n; i++) {
            sum = sum + ns[i];
            System.out.print("+" + ns[i]);
        }
        System.out.println(" = " + sum); 
    }
}
