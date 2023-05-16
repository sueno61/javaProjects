package Lesson04;

import java.util.Scanner;
import java.util.Random;

public class TransposeMat2 {
    public static void main(String[] args) {

        Scanner sysIn = new Scanner(System.in);
        int cnt;
        String[] strSplit;
        do {
            System.out.println("行数ｎと列数ｍを空白で区切って入力してください。");
            String strInput = sysIn.nextLine();
            strSplit = strInput.split(" ");
            cnt = strSplit.length;
        } while (cnt != 2);
        sysIn.close();

        int n = Integer.parseInt(strSplit[0]);
        int m = Integer.parseInt(strSplit[1]);

        int A[][] = new int[n][m];
        int At[][] = new int[m][n];
        int Dummy[][] = new int[m][n];

        // 入力された内容を画面に表示
        System.out.println("行数（たて）は、" + n);
        System.out.println("列数（よこ）は、" + m);

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = rand.nextInt(10);
                A[i][j] = num;
                Dummy[j][i] = num;
            }
        }

        System.out.println("行列A: (" + n + "X" + m + ")");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }
        // 転置
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                At[j][i] = A[i][j];
            }
        }

        System.out.println("転置行列A_t: (" + m + "X" + n + ")");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + At[i][j]);
            }
            System.out.println();
        }

        System.out.println("Dummy行列:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + Dummy[i][j]);
            }
            System.out.println();
        }
    }
}
