package Lesson07;

import java.util.Scanner;

public class Matcalc2 {
    public static void main(String[] args) {

        Scanner sysIn = new Scanner(System.in);
        System.out.println("A行列の行数nと列数mを指定：");
        System.out.println("（B行列は(m x n)となります）");
        int An = sysIn.nextInt();
        int Am = sysIn.nextInt();

        int A[][] = new int[An][Am];
        int B[][] = new int[Am][An];

        // A行列の値
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Aの%d行目:\n", i);
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = sysIn.nextInt();
            }
        }

        // B行列の値
        for (int i = 0; i < B.length; i++) {
            System.out.printf("Bの%d行目:\n", i);
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = sysIn.nextInt();
            }
        }
        sysIn.close();

        System.out.println("\n行列A:");
        printMat(A);

        System.out.println("\n行列B:");
        printMat(B);

        // Aを転置して表示
        int At[][] = new int[Am][An];
        At = transMat(A);
        System.out.println("\nAの転置AT:");
        printMat(At);

        // Bを転置して表示
        int Bt[][] = new int[An][Am];
        Bt = transMat(B);
        System.out.println("\nBの転置BT:");
        printMat(Bt);

        // A x B
        int Ans1[][] = new int[An][An];
        Ans1 = multMat(A, B);
        System.out.println("\n掛け算AxB:");
        printMat(Ans1);

        // (AxB)t
        int Ans2[][] = new int[An][An];
        Ans2 = transMat(Ans1);
        System.out.println("\n掛け算(AxB)後の行列の転置(AxB)T:");
        printMat(Ans2);

        // At x Bt
        int Ans3[][] = new int[An][An];
        Ans3 = multMat(Bt, At);
        System.out.println("\nBTとATの掛け算(BTxAT):");
        printMat(Ans3);
    }

    // 転置メソッド
    static int[][] transMat(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int At[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                At[j][i] = A[i][j];
            }
        }

        return At;
    }

    // 行列の積メソッド
    static int[][] multMat(int[][] A, int[][] B) {
        int An = A.length;
        int Am = A[0].length;
        // int Bn = B.length;
        int Bm = B[0].length;
        int Ans[][] = new int[An][Bm];

        for (int i = 0; i < An; i++) {
            for (int j = 0; j < Bm; j++) {
                for (int k = 0; k < Am; k++) {
                    Ans[i][j] = Ans[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        return Ans;
    }

    // 行列の表示メソッド
    static void printMat(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                // System.out.print(" " + M[i][j]);
                System.out.printf("%3d", M[i][j]);
            }
            System.out.println();
        }
    }
}