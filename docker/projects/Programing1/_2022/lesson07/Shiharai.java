public class Shiharai {
    public static void main(String[] args) {
        System.out.println("商品の単価と数量を入力してください。");
        String line = System.console().readLine("単価=");
        int tanka = Integer.parseInt(line);
        line = System.console().readLine("数量=");
        int suu = Integer.parseInt(line);

        if (tanka <= 0 || suu <= 0) {
            System.out.println("単価および数量は正の値にしてください。");
        } else {

            int kingaku = tanka * suu;
            if (kingaku < 2500) {
                kingaku = kingaku + 530;
            }

            // System.out.println("支払い金額は" + kingaku + "円です。");
            System.out.println(kingaku);
        }
    }
}