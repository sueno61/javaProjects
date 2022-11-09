public class Urudosi2 {
  public static void main(String[] args) {
    String s = System.console().readLine("西暦を入力してください。");
    int y = Integer.parseInt(s);
    if ( (y%400 != 0) && ((y%100==0)||(y%4!=0)) ) {
      System.out.println("うるう年ではありません。");
    } else {
      System.out.println("うるう年です。");
    }
  }
}
