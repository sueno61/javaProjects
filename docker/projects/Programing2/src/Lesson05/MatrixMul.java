package Lesson05;

import java.util.Random;
import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {

        Scanner sysIn = new Scanner(System.in);
        int An = sysIn.nextInt();
        int Am = sysIn.nextInt();
        int Bn = sysIn.nextInt();
        int Bm = sysIn.nextInt();
        sysIn.close();

        Random rand = new Random();

        if (Am != Bn) {
            System.out.println("掛け算はできません");
        } else {

            int A[][] = new int[An][Am];
            int B[][] = new int[Bn][Bm];
            int Ans[][] = new int[An][Bm];
            for (int i = 0; i < An; i++) {
                for (int j = 0; j < Bm; j++) {
                    Ans[i][j] = 0;
                }
            }

            for (int i = 0; i < An; i++) {
                for (int j = 0; j < Am; j++) {
                    int num = rand.nextInt(10);
                    A[i][j] = num;
                }
            }
            System.out.println("行列A: (" + An + "X" + Am + ")");
            for (int i = 0; i < An; i++) {
                for (int j = 0; j < Am; j++) {
                    System.out.print(" " + A[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < Bn; i++) {
                for (int j = 0; j < Bm; j++) {
                    int num = rand.nextInt(10);
                    B[i][j] = num;
                }
            }
            System.out.println("行列B: (" + Bn + "X" + Bm + ")");
            for (int i = 0; i < Bn; i++) {
                for (int j = 0; j < Bm; j++) {
                    System.out.print(" " + B[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < An; i++) {
                for (int j = 0; j < Bm; j++) {
                    for (int k = 0; k < Am; k++) {
                        Ans[i][j] = Ans[i][j] + A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("行列Ans (A X B): ");
            for (int i = 0; i < An; i++) {
                for (int j = 0; j < Bm; j++) {
                    System.out.print(" " + Ans[i][j]);
                }
                System.out.println();
            }

        }

    }
}
