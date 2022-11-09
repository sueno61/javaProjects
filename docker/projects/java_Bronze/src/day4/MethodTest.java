package day4;

public class MethodTest {
    public static void main(String[] args) {
        int a = 10;
        int ret = MultiTwoInt(a, 20);

        System.out.println("戻りは " + ret);
    }

    public static int MultiTwoInt(int x, int y) {
        System.out.println(x * y);
        return x * y;
    }

}
