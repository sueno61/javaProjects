package Lesson10;

public class Fraction {
	int numerator;
	int denominator;

	void add(Fraction f) {
		numerator = numerator * f.denominator + denominator * f.numerator;
		denominator = denominator * f.denominator;
	}

	void add(int n) {
		numerator = numerator + denominator * n;
	}

	void add(int numerator, int denominator) {
		numerator = numerator * denominator + denominator * numerator;
		denominator = denominator * denominator;
	}

}
