package Lesson10;

public class FractionTest3 {

	public static void main(String[] args) {

		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();

		f1.numerator = 1;
		f1.denominator = 2;
		f2.numerator = 3;
		f2.denominator = 4;

		System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
		System.out.println("f2=" + f2.numerator + "/" + f2.denominator);

		f1.add(f2);
		System.out.println("f1=f1+f2=" + f1.numerator + "/" + f1.denominator);

		f1.add(3);
		System.out.println("f1+3=" + f1.numerator + "/" + f1.denominator);

	}

}
