package exec;

public class TestArray {

	public static void main(String[] args) {
		int[] a = { 22, 44, 66, 55, 33 };
		System.out.println("a: " + a);

		print(a);

		int[] b;
		b = a;

		System.out.println("b: " + b);
		print(b);

		a[3] = 88;
		System.out.println("a[3] = 88");
		print(a);
		print(b);

		b[1] = 11;
		System.out.println("b[1] = 11");
		print(a);
		print(b);
	}

	public static void print(int[] x) {

		System.out.print(x + ":");

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

}
