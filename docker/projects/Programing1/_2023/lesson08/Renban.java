public class Renban {
    public static void main(String[] args) {
        String s;
        int n1, n2, n3;

        s = System.console().readLine();
        n1 = Integer.parseInt(s);
        s = System.console().readLine();
        n2 = Integer.parseInt(s);

        if (n1 - n2 == 1) {
            s = System.console().readLine();
            n3 = Integer.parseInt(s);
            if (n2 - n3 == 1) {
                System.out.println("連番です。");
            } else {
                System.out.println("連番ではありません。");
            }
        } else if (n2 - n1 == 1) {
            s = System.console().readLine();
            n3 = Integer.parseInt(s);
            if (n3 - n2 == 1) {
                System.out.println("連番です。");
            } else {
                System.out.println("連番ではありません。");
            }

        } else {
            System.out.println("連番ではありません。");
        }

    }
}
