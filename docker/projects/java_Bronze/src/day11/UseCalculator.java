package day11;

public class UseCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setPrice(5000);
        calc.setQty(3);
        calc.setTaxCal(new NewTypeTax());
        int result = calc.getResult();
        System.out.println(result);
    }
    
}
