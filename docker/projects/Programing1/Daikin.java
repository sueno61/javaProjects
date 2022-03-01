public class Daikin {
  public static void main(String[] args) {

    System.out.println("１．コーヒー（220円）");
    System.out.println("２．ランチセット（580円）");
    System.out.println("３．コーヒー豆（980円）");
    String s = System.console().readLine("どれを購入しますか？（1-3）：");
    int sel = Integer.parseInt(s);
    s = System.console().readLine("いくつ購入しますか？：");
    int num = Integer.parseInt(s);

    int to = 0;
    if (sel == 1) {
      s = System.console().readLine("店内でお召し上がりですか？（0:店内，1:持ち帰り）：");
      to = Integer.parseInt(s);
    }

    if (sel == 1) {
      int net = 220*num;
      System.out.println("税抜きで " + net + " 円です。");

      if (to == 1) {
        System.out.println("税込みで " + (int)(net*1.08) + " 円です。");
      } else {
        System.out.println("税込みで " + (int)(net*1.1) + " 円です。");
      }

    } else if (sel == 2) {
      int net = 580*num;
      System.out.println("税抜きで " + net + " 円です。");
      System.out.println("税込みで " + (int)(net*1.1) + " 円です。");

    } else if (sel == 3) {
      int net = 980*num;
      System.out.println("税抜きで " + net + " 円です。");
      System.out.println("税込みで " + (int)(net*1.08) + " 円です。");

    } else {
      System.out.println("選択が正しくありませんでした");
    }


  }
}
