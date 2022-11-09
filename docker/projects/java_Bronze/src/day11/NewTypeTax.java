package day11;

public class NewTypeTax extends TaxCaluculator{
    @Override
    public int getResult() {
        if (10000 < super.price) {
            int tmp = (int)(10000 * 1.08);
            tmp += (super.price - 10000) * 1.1;
            return tmp;
        }

        return (int)(super.price * 1.08);
    }
    
}
