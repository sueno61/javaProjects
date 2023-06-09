package Lesson09_2023;

public class FractionTest4 {

	public static void main(String[] args) {

		Fraction f = new Fraction();

		f.numerator = 1;
		f.denominator = 2;

		System.out.println("f=" + f.numerator + "/" + f.denominator);

		System.out.println("=== add 3 to f ===");
		f.add(3);
		System.out.println("f=" + f.numerator + "/" + f.denominator);
	}
}
