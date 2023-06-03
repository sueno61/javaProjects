package exec;

public class Array1 {

	public static void main(String[] args) {

		double[] root; // 宣言
		root = new double[5]; // 初期化

		//		double[] root = new double[5]; 

		root[0] = 0.0;
		root[1] = 1.0;
		root[2] = 1.414;
		root[3] = 1.732;
		root[4] = 2.0;

		System.out.println(root[0]);
		System.out.println(root[1]);
		System.out.println(root[2]);
		System.out.println(root[3]);
		System.out.println(root[4]);

		System.out.println("項目数：" + root.length);

		for (int i = 0; i < root.length; i++) {
			System.out.println(root[i]);
		}
	}

}
