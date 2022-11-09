package day12;

public abstract class TaxCalculator {
    protected int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int getResult();
}
