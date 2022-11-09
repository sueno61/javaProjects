class EvenOddTest1 {
  static void check(int n) {
    if (n % 2 == 0) {
      System.out.println(n + "は偶数です。");
    } else {
      System.out.println(n + "は奇数です。");
    }
  }
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      check(i);
    }
  }
}
