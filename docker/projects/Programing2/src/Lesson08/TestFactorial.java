package Lesson08;

public class TestFactorial {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			System.out.println("f(" + i + ")= " + f(i));
		}

	}

	static long f(int n) {
		if (n < 2)
			return 1;
		return n * f(n - 1);
	}

}
