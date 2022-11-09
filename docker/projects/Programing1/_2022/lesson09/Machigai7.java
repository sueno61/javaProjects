public class Machigai7 {
  public static void main(String[] args) {
    int i, j;
    for (i = 0; i < 9; i = i + 1) {
      System.out.print(i + ": ");
      for (j = 0; j < i*i; j = j + 1) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}