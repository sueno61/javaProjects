package Lesson04;

public class Array2 {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4 };

		System.out.print(a[0]);
		System.out.print(a[1]);
		System.out.print(a[2]);
		System.out.print(a[3]);
		System.out.print(a[4]);

		System.out.println();
		System.out.println(a.length);

		System.out.println("lengthを使ったfor:");
		for (int i = 0; i < a.length; i = i + 1) {
			System.out.print(a[i]);
		}
		System.out.println();

		System.out.println("拡張for:");
		for (int n : a) {
			System.out.print(n);
		}
		System.out.println();
	}

}
