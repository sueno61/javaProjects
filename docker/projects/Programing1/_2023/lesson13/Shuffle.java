package lesson13;

public class Shuffle {
    public static void main(String[] args) {
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] a = new int[13];
        for (int i = c.length - 1; i >= 0; i--) {

            int s = (int) (Math.random() * i);

            // System.out.print(s + ",");
            a[i] = c[s];
            // int w;
            // w = c[i];
            c[s] = c[i];
            // c[s] = w;
            // System.out.println(w);
        }
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
