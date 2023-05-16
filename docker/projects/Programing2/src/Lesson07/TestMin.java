package Lesson07;

import java.util.Random;

class TestMin {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int m = rand.nextInt(100);
            int n = rand.nextInt(100);
            int y = min(m, n);
 
            System.out.println("min(" + m + ", " + n + ") = " + y);
        }
    }
    static int min(int x, int y) {  
//    	return (x < y ? x : y);
    	if (x < y) {
			return x;
		} else {
			return y;
		}
    }
} 