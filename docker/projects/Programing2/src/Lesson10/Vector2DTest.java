package Lesson10;

public class Vector2DTest {
    public static void main(String[] args) {
        Point v1p1 = new Point(2, 1);
        Point v1p2 = new Point(-3, 6);
        Vector2D vectors1 = new Vector2D(v1p1, v1p2);
        // 初期表示
        System.out.println("初期値表示v1");
        System.out.println(vectors1.toString());
        System.out.println(vectors1.length());

        System.out.println("内積：" + vectors1.dot(vectors1));
        System.out.println("平行：" + vectors1.isParallel(vectors1));
        System.out.println("直交：" + vectors1.isVertical(vectors1));

        System.out.println("和と差ののち、3倍して再表示");
        vectors1.add(vectors1);
        vectors1.sub(vectors1);
        vectors1.mult(3);

        System.out.println(vectors1.toString());
        System.out.println(vectors1.length());

    }
}
