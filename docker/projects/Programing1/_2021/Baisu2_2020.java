public class Baisu2_2020 {
  public static void main(String[] args) {

    String s = System.console().readLine("整数を入力してください: ");
    int n = Integer.parseInt(s);

    System.out.println(baisu(n, 2));
    System.out.println(baisu(n, 3));
    System.out.println(baisu(n, 7));
  }

  private static String baisu(int a, int b) {
    if (a%b == 0) {
      return a + "は" + b + "の倍数です。";
    } else {
      return a + "は" + b + "の倍数ではありません。";
    }
  }
}
