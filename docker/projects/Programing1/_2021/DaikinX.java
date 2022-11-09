public class DaikinX {
  public static void main(String[] args) {

    String s;
    int sel ;
    int num ;

    int to=0;
    int net= 0;
    int gross= 0;

    System.out.println("１．コーヒー（220円）");
    System.out.println("２．ランチセット（580円）");
    System.out.println("３．コーヒー豆（980円）");
    s = System.console().readLine("どれを購入しますか？（1-3）：");
    sel = Integer.parseInt(s);
    s = System.console().readLine("いくつ購入しますか？：");
    num = Integer.parseInt(s);

    if (sel == 1) {
      s = System.console().readLine("店内でお召し上がりですか？（0:店内，1:持ち帰り）：");
      to = Integer.parseInt(s);
    }

    if (sel == 1) {
      net = 220*num;
      if (to == 1) {
        gross = (int)(net*1.08);
      } else {
        gross = (int)(net*1.1);
      }

    } else if (sel == 2) {
      net = 580*num;
      gross = (int)(net*1.1);

    } else if (sel == 3) {
      net = 980*num;
      gross = (int)(net*1.08);
    } else {
      System.out.println("選択が正しくありませんでした");
    }

    System.out.println("税抜きで " + net + " 円です。");
    System.out.println("税込みで " + gross + " 円です。");
  }
}
