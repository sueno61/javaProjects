package day4;

public class ThreeMethodTest {
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("test 呼び出し");
        test();
        System.out.println("main end");
    }

    public static void test() {
        System.out.println("test start");
        System.out.println("sample 呼び出し");
        sample();
        System.out.println("test end");
    }

    public static void sample() {
        System.out.println("sample RUN!");
    }
    
}
