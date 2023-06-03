package exec;

public class Array2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		System.out.print(a[0]);
		System.out.print(a[1]);
		System.out.print(a[2]);
		System.out.print(a[3]);
		System.out.print(a[4]);

		System.out.println();
		System.out.println(a.length);

		for (int num : a) {
			System.out.print(num);
		}

	}

}
