package day8;

public class ShoppingSample {
    public static void main(String[] args) {

        Item apple = new Item("apple", 100);
        Item orange = new Item("orange", 120);
        Item banana = new Item("banana", 80);

        ShoppingCart cart = new ShoppingCart();
        cart.add(new Order(apple, 3));
        cart.add(new Order(orange, 5));
        cart.add(new Order(banana, 2));
        cart.add(new Order(orange, 4));

        int total = cart.getTotal();
        System.out.println(total);
    }
    
}
