public class SortData {
    /**
     * @param args: 並び替えたい数字
     * 大きい順に並べ替え
     */
    public static void main(String[] args) {
        int len = args.length;
        int[] data = new int[len];

        System.out.println("並べ替える前");
        for (int i = 0; i < len; i = i + 1) {
            data[i] = Integer.parseInt(args[i]);
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < data.length-1; i = i + 1) {
            for (int j = i + 1; j < data.length ; j = j + 1) {
                if (data[i]  < data[j]) {
                    // 交換
                    int t = data[i];
                    data[i] = data[j];
                    data[j] = t;
                }
            }
        }
        System.out.println("並べ替えた後");
        for (int i = 0; i < data.length; i = i + 1) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}