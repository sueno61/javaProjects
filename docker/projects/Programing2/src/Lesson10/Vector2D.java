package Lesson10;

import java.lang.Math;

public class Vector2D {
    Point p1, p2, pADD, pSUB;
    int p1x, p1y, p2x, p2y, X, Y;
    double p1len, p2len;

    public Vector2D(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.p1x = this.p1.getX();
        this.p1y = this.p1.getY();
        this.p2x = this.p2.getX();
        this.p2y = this.p2.getY();

        this.X = this.p2.getX() - this.p1.getX();
        this.Y = this.p2.getY() - this.p1.getY();
    }

    public double length() {
        return Math.pow(this.X * this.X + this.Y * this.Y, 0.5);
    }

    public void add(Vector2D v) {
        int X = v.p2.getX() - v.p1.getX();
        int Y = v.p2.getY() - v.p1.getY();

        this.X = this.X + X;
        this.Y = this.Y + Y;
    }

    public void sub(Vector2D v) {
        int X = v.p2.getX() - v.p1.getX();
        int Y = v.p2.getY() - v.p1.getY();

        this.X = this.X - X;
        this.Y = this.Y - Y;
    }

    public void mult(int k) {
        this.X = this.X * k;
        this.Y = this.Y * k;
    }

    public double dot(Vector2D v) {
        int X = v.p2.getX() - v.p1.getX();
        int Y = v.p2.getY() - v.p1.getY();

        double result = this.X * X + this.Y * Y;
        return result;
    }

    public boolean isParallel(Vector2D v) {
        int X = v.p2.getX() - v.p1.getX();
        int Y = v.p2.getY() - v.p1.getY();

        if (this.X * Y == this.Y * X) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isVertical(Vector2D v) {
        if (this.dot(v) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "p1=(" + this.p1x + ", " + this.p1y + ")\n"
                + "p2=(" + this.p2x + ", " + this.p2y + ")";
    }
}
