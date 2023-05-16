package Lesson07;

class TestFactorial {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("f(" + i + ") = " + f(i));
        }
    }

    static long f(int n) {
        long f = 1;
        while (n > 1) {
            f *= n--;
        }
        return f;
    }
}