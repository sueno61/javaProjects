public class SortData_base {
    /**
     * 教科書の課題：小さい順に並べ替え
     * @param args
     */
    public static void main(String[] args) {
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        System.out.println("並べ替える前");
        for (int i = 0; i < data.length; i = i + 1) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < data.length-1; i = i + 1) {
            for (int j = i + 1; j < data.length ; j = j + 1) {
                if (data[i] > data[j]) {
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