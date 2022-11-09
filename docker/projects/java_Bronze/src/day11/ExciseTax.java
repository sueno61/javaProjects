package day11;

public class ExciseTax extends TaxCaluculator {
    @Override
    public int getResult() {
        int result = (int)(super.price * 1.08);
        return result;
    }
    
}
