package Lesson10;

public class Fraction2Test {

	public static void main(String[] args) {

		Fraction2 f1 = new Fraction2(5, 12);
		Fraction2 f2 = new Fraction2(1, 3);

		System.out.println("** add **");
		System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
		System.out.println("f2=" + f2.numerator + "/" + f2.denominator);
		f1.add(f2);
		//		System.out.println("f1 add f2: " + f1.numerator + "/" + f1.denominator);
		System.out.println("f1 add f2: " + f1.toString());

		System.out.println("\n** div **");
		System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
		System.out.println("f2=" + f2.numerator + "/" + f2.denominator);
		f1.div(f2);
		System.out.println("f1 div f2: " + f1.numerator + "/" + f1.denominator + "(" + f1.toDecimal());

		System.out.println("\n** multi **");
		System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
		System.out.println("f2=" + f2.numerator + "/" + f2.denominator);
		f1.multi(f2);
		System.out.println("f1 * f2: " + f1.numerator + "/" + f1.denominator);

		System.out.println("\n** sub **");
		System.out.println("f1=" + f1.numerator + "/" + f1.denominator);
		System.out.println("f2=" + f2.numerator + "/" + f2.denominator);
		f1.sub(f2);
		System.out.println("f1 sub f2: " + f1.numerator + "/" + f1.denominator);

		System.out.println("\n** reduce **");
		f1.reduce();
		System.out.println("reduced:" + f1.numerator + "/" + f1.denominator);

		System.out.println("\n** 約分と文字列表示 **");
		Fraction2 f3 = new Fraction2(51, 17);
		System.out.println("f3:" + f3.numerator + "/" + f3.denominator);
		f3.reduce();
		System.out.println("reduced:" + f3.numerator + "/" + f3.denominator + " toString:" + f3.toString());

	}

}
