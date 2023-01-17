public class Exsam2a {
    public static void main(String[] args) {
        String[] name = { "A", "B", "C", "D" };
        int[] score = { 75, 59, 68, 82 };
        int[] rank = { 2, 4, 3, 1 };

        System.out.println("[スコア]");
        for (int i = 0; i < name.length; i = i + 1) {
            System.out.printf("%s: %d点（%d位）\n", name[i], score[i], rank[i]);
        }
        System.out.println("[順位]");
        for (int i = 0; i < name.length; i = i + 1) {
            if (rank[i] == 1) {
                System.out.printf("（%d位）%s: %d点\n", rank[i], name[i], score[i]);
            }
        }
    }
}