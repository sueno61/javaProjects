package day4;

public class ForEach {  
    public static void main(String[] args) {
    
        int[] array = {10, 20, 30};

        for (int val : array) {
            System.out.println(val);
        }

        for (int j = 0; j < array.length; j++) {
            int val = array[j];
            System.out.println(val);
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

    }

}
