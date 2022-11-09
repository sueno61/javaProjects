public class Order {
    public static void main(String[] args) {
        String line = System.console().readLine("欲しい商品の名前: ");
        System.out.println("「" + line + "」を注文します。"); 
    }
}