package Lesson10;

public class CoinPurseTest {

	public static void main(String[] args) {

		System.out.println("p1 0円で初期化");

		CoinPurse p1 = new CoinPurse();
		p1.show();

		System.out.println("1398円　追加");
		p1.add(1398);
		p1.show();

		System.out.println("p2 1398円で初期化");

		CoinPurse p2 = new CoinPurse(1398);
		p2.show();

		System.out.println("698円　追加");
		p2.add(698);
		p2.show();

		System.out.println("p3: 1, 2, 4, 8, 16, 32 で初期化");

		CoinPurse p3 = new CoinPurse(1, 2, 4, 8, 16, 32);
		p3.show();

		System.out.println("10円　を３枚追加");
		p3.add("10円", 3);
		p3.show();
		System.out.println("100円　を2枚追加");
		p3.add("100円", 2);
		p3.show();

		System.out.println("669円　支払い");
		p3.pay(669);
		p3.show();

		System.out.println("200円　を2枚追加");
		p3.add("200円", 2);
		p3.show();

		System.out.println("663円　支払い");
		p3.pay(663);
		p3.show();

	}

}
