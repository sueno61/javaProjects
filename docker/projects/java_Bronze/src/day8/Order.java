package day8;

public class Order {
    private Item item;
    private int qty;
    public Order(Item item, int qty) {
        this.item = item;
        this.qty = qty;
    }

    public int getTotal() {
        return this.qty * this.item.getPrice();
    }

    public Item getItem() {
        return item;
    }
    public int getQty() {
        return qty;
    }
    
}
