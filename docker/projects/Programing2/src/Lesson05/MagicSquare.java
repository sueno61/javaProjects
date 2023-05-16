package Lesson05;

import java.util.Scanner;

public class MagicSquare {

    public static void printBoard(int[][] board) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkBoard(int[][] board) {
        boolean chk = false;
        int s1, s2;
        for (int i = 0; i < 3; i++) {
            s1 = s2 = 0;
            for (int j = 0; j < 3; j++) {
                s1 = s1 + board[i][j];
                s2 = s2 + board[j][i];
            }
            if ((s1 != 15) || (s2 != 15)) {
                return chk;
            }
        }

        s1 = s2 = 0;
        for (int i = 0; i < 3; i++) {
            s1 = s1 + board[i][i];
            s2 = s2 + board[i][2 - i];
        }
        if ((s1 != 15) || (s2 != 15)) {
            return chk;
        }

        chk = true;
        return chk;
    }

    public static void main(String args[]) {
        int[][] square = {
                { 4, 0, 0 },
                { 3, 5, 0 },
                { 8, 0, 0 }
        };
        int[] uNum = { 0, 0, 0, 1, 1, 1, 0, 0, 1, 0 }; // 使用済みの数

        printBoard(square); // 初期盤面

        int numOfEmp = 5; // 空マスの数

        Scanner sysIn = new Scanner(System.in);
        do {
            int n = sysIn.nextInt();
            int m = sysIn.nextInt();
            int num = sysIn.nextInt();
            // sysIn.close();

            if (square[n][m] != 0) {
                System.out.println("入力済みの場所です");
                continue;
            }
            if (uNum[num] == 1) {
                System.out.println("使用済みの数字です");
                continue;
            }

            square[n][m] = num;
            uNum[num] = 1;
            numOfEmp = numOfEmp - 1;

            printBoard(square);

        } while (numOfEmp > 0);

        sysIn.close();

        if (checkBoard(square)) {
            System.out.println("正解！");

        }
    }
}
