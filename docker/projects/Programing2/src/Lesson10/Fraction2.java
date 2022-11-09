package Lesson10;

public class Fraction2 {

	int numerator;
	int denominator;

	Fraction2(int n, int d) {
		numerator = n;
		denominator = d;
	}

	// 自身が保有している分数に、引数で与えられた分数を加算し、自身の分数を置き換え
	void add(Fraction2 f) {
		numerator = numerator * f.denominator + denominator * f.numerator;
		denominator = denominator * f.denominator;
	}

	void sub(Fraction2 f) {
		numerator = numerator * f.denominator - denominator * f.numerator;
		denominator = denominator * f.denominator;
	}

	void multi(Fraction2 f) {
		numerator = numerator * f.numerator;
		denominator = denominator * f.denominator;
	}

	void div(Fraction2 f) {
		numerator = numerator * f.denominator;
		denominator = denominator * f.numerator;
	}

	void reduce() {

		int a, b;
		int r = 1;
		if (numerator > denominator) {
			a = numerator;
			b = denominator;
		} else {
			a = denominator;
			b = numerator;
		}

		while (r > 0) {
			r = a % b;
			a = b;
			b = r;
		}

		numerator = numerator / a;
		denominator = denominator / a;
	}

	double toDecimal() {
		return (double) numerator / (double) denominator;
	}

	public String toString() {
		if (denominator == 1) {
			return numerator + "";
		} else {
			return numerator + "/" + denominator;
		}
	}

}