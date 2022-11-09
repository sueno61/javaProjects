package Lesson10;

public class CoinPurse {

	final int[] YENS = { 500, 100, 50, 10, 5, 1 };
	private int[] cs = new int[6];

	// constructors
	CoinPurse() {
		for (int i = 0; i < cs.length; i++) {
			cs[i] = 0;
		}
	}

	CoinPurse(int amount) {
		for (int i = 0; i < cs.length; i++) {
			cs[i] = 0;
		}
		add(amount);
	}

	CoinPurse(int i500, int i100, int i50, int i10, int i5, int i1) {
		cs[0] = i500;
		cs[1] = i100;
		cs[2] = i50;
		cs[3] = i10;
		cs[4] = i5;
		cs[5] = i1;
	}

	int sumOfMoney() {
		int sum = 0;
		for (int i = 0; i < YENS.length; i++) {
			sum += cs[i] * YENS[i];
		}

		return sum;
	}

	void add(int amount) {
		int[] cnt = new int[YENS.length];

		for (int i = 0; i < YENS.length; i++) {

			while (amount >= YENS[i]) {
				amount -= YENS[i];
				cnt[i]++;
			}
		}

		for (int i = 0; i < YENS.length; i++) {
			cs[i] += cnt[i];
		}
	}

	void add(String kind, int suu) {

		if (kind == "500円") {
			cs[0] += suu;
		} else if (kind == "100円") {
			cs[1] += suu;
		} else if (kind == "50円") {
			cs[2] += suu;
		} else if (kind == "10円") {
			cs[3] += suu;
		} else if (kind == "5円") {
			cs[4] += suu;
		} else if (kind == "1円") {
			cs[5] += suu;
		} else {
			System.out.println("金種の誤り");
		}
	}

	boolean isPayable(int pay) {
		return (sumOfMoney() >= pay);
	}

	void pay(int amount) {

		if (!isPayable(amount)) {
			System.out.println("残高不足です。不足：" + (amount - sumOfMoney()));

		} else {
			int[] cnt = new int[YENS.length];

			for (int i = 0; i < YENS.length; i++) {
				while (amount >= YENS[i]) {
					amount -= YENS[i];
					cnt[i]++;
				}
			}

			for (int i = 0; i < YENS.length; i++) {
				cs[i] -= cnt[i];
			}
		}
	}

	void show() {
		for (int i = 0; i < YENS.length; i++) {
			System.out.print(YENS[i] + "円：" + cs[i] + "枚、");
		}
		System.out.println("残高：" + sumOfMoney() + "円");
	}

}
