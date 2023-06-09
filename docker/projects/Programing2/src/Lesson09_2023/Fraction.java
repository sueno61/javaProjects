package Lesson09_2023;

public class Fraction {
	int numerator;
	int denominator;
	int yakusu;

	void add(Fraction f) {
		numerator = numerator * f.denominator + denominator * f.numerator;
		denominator = denominator * f.denominator;

		yakusu = yakubun(numerator, denominator);
		numerator = numerator / yakusu;
		denominator = denominator / yakusu;
	}

	void add(int n) {
		numerator = numerator + denominator * n;

		yakusu = yakubun(numerator, denominator);
		numerator = numerator / yakusu;
		denominator = denominator / yakusu;
	}

	void add(int numerator, int denominator) {
		this.numerator = this.numerator * denominator + this.denominator * numerator;
		this.denominator = this.denominator * denominator;

		yakusu = yakubun(this.numerator, this.denominator);
		this.numerator = this.numerator / yakusu;
		this.denominator = this.denominator / yakusu;
	}

	int yakubun(int n, int d) {
		int a, b, r;
		if (n > d) {
			a = n;
			b = d;
		} else {
			a = d;
			b = n;
		}

		int ret = -1;

		do {
			r = a % b;
			if (r == 0) {
				ret = b;
				break;
			}
			if (a > b) {
				a = b;
				b = r;
			} else {
				ret = 1;
				break;
			}
		} while (ret == -1);

		return ret;
	}

}
