public class Keisan { 
  public static void main(String[] arg) { 
    int x; 
    x = 7; 

    x = 2 * x + 1; 
    System.out.println("途中経過：x は " + x + " です。");
    x = 2 * x + 1; 
    System.out.println("途中経過：x は " + x + " です。");
    x = 2 * x + 1; 

    System.out.println("変数 x の内容は " + x + " です。"); 
  } 
}