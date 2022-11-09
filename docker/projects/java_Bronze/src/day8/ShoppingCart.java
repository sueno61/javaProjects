package day8;

//import jdk.jfr.internal.PrivateAccess;

public class ShoppingCart {
    private Order[] orders = new Order[10];
    private int index = 0;

// Orderを受け取ってShoppingCartに追加
    public void add(Order order) {
        if (index < orders.length) {  // 10行まで
            this.orders[index] = order;
            index++;
        }
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < index; i++) {
            total = total + this.orders[i].getTotal();
        }
        return total;
    }
   
}
