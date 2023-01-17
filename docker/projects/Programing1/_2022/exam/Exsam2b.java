public class Exsam2b {
    public static void main(String[] args) {
        String[] name = { "A", "B", "C", "D" };
        int[] score = { 75, 59, 68, 82 };
        int[] rank = { 2, 4, 3, 1 };

        System.out.println("[順位]");
        for (int j = 1; j <= name.length; j = j + 1) {
            for (int i = 0; i < name.length; i = i + 1) {
                if (rank[i] == j) {
                    System.out.printf("（%d位）%s: %d点\n", rank[i], name[i], score[i]);
                }
            }

        }
    }
}