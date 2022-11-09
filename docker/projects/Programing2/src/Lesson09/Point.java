package Lesson09;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Point p) {
		return (x == p.x && y == p.y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return new String("(" + x + "," + y + ")");
	}
}
