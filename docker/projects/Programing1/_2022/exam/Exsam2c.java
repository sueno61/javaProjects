public class Exsam2c {
    public static void main(String[] args) {
        String[] name = { "A", "B", "C", "D" };
        int[] score = { 75, 59, 68, 82 };
        int[] rank = { 2, 4, 3, 1 };

        int idB = 1;

        // ランダムにBさんにあげる
        int ad = ((int) (Math.random() * 3) + 1) * 10;
        score[idB] = score[idB] + ad;

        // 加点の表示
        System.out.printf("Bさんに%d点をあげました。\n", ad);

        // rank更新
        for (int i = 0; i < name.length; i = i + 1) {
            if (score[i] < score[idB]) {
                rank[i] = rank[i] + 1;
                rank[idB] = rank[idB] - 1;
            }
        }

        // 結果表示
        System.out.println("[スコア]");
        for (int i = 0; i < name.length; i = i + 1) {
            System.out.printf("%s: %d点（%d位）\n", name[i], score[i], rank[i]);
        }
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