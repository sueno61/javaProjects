package Lesson09_2022;
public class FractionTest2 {

	public static void main(String[] args) {

			Fraction f1 = new Fraction();
			Fraction f2 = new Fraction();
			
			f1.numerator = 1;
			f1.denominator = 2;
			f2.numerator = 3;
			f2.denominator = 4;

			System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
			System.out.println("f2=" + f2.numerator + "/" + f2.denominator);
			
			System.out.println("=== add f2 to f1 ===");
			f1.add(f2);

			System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
			System.out.println("f2=" + f2.numerator + "/" + f2.denominator);
			
			System.out.println("=== add 2 to f2 ===");
			f2.add(2);

			System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
			System.out.println("f2=" + f2.numerator + "/" + f2.denominator);
			
			System.out.println("=== add 5/2 to f1 ===");
			f1.add(5, 2);

			System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
			System.out.println("f2=" + f2.numerator + "/" + f2.denominator);
	}

}
