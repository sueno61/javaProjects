public class Baisu2_2 {
  public static void main(String[] args) {
    int nums[] = {2, 3, 7};
    String s;
    int n;

    s = System.console().readLine("整数を入力してください: ");
    n = Integer.parseInt(s);

    for (int num: nums) {
      System.out.println(baisu(n, num));
    }
  }

  private static String baisu(int a, int b) {
    if (a%b == 0) {
      return a + "は" + b + "の倍数です。";
    } else {
      return a + "は" + b + "の倍数ではありません。";
    }
  }
}
