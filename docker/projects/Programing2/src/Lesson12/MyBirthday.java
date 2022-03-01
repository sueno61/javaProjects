package Lesson12;

public class MyBirthday {

	int y, md;

	static final int REIWA = 20190501;
	static final int HEISEI = 19890108;
	static final int SHOWA = 19261225;
	static final int TAISHO = 19120730;
	static final int MEIJI = 18680908;

	MyBirthday(int seireki, int gappi) {
		this.y = seireki;
		this.md = gappi;
	}

	public String toWareki() {

		String gg;
		int wa;

		int ymd = this.y * 10000 + this.md;

		if (ymd >= REIWA) {
			gg = "令和";
			wa = this.y - REIWA / 10000 + 1;
		} else if (ymd >= HEISEI) {
			gg = "平成";
			wa = this.y - HEISEI / 10000 + 1;
		} else if (ymd >= SHOWA) {
			gg = "昭和";
			wa = this.y - SHOWA / 10000 + 1;
		} else if (ymd >= TAISHO) {
			gg = "大正";
			wa = this.y - TAISHO / 10000 + 1;
		} else if (ymd >= MEIJI) {
			gg = "明治";
			wa = this.y - MEIJI / 10000 + 1;
		} else {
			return "（明治以前は未対応）";
		}

		if (wa == 1)
			return gg + "元";
		else
			return gg + wa + "";
	}

	public String getDayOfWeek() {
		String[] dw = { "土", "日", "月", "火", "水", "木", "金" };

		int m = md / 100;
		int d = md % 100;

		int C = y / 100;
		int Y = y % 100;
		int G = 5 * C + C / 4;

		int h = (d + (26 * (m + 1) / 10) + Y + Y / 4 + G) % 7;

		return dw[h];
	}

	public String toString() {
		return y + "（" + toWareki() + "）年" + md / 100 + "月" + md % 100 + "日（" + getDayOfWeek() + "）";
	}

}
