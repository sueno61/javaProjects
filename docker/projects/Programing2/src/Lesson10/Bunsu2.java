package Lesson10;

class Bunsu2 extends Bunsu {

	private int bunshi, bunbo;

	public Bunsu2() {
		super();
	}

	public Bunsu2(int n) {
		super(n);
	}

	public Bunsu2(int m, int n) {
		super(m, n);
	}

	// dummy
	int use() {
		return bunshi / bunbo;
	}
}
