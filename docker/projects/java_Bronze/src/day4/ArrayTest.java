package day4;

public class ArrayTest {

    public static void main(String[] args) {   

        /*  
        int[] array = new int[3];  
        for (int i = 0; i < 3; i++) {
            array[i] = (i+1)*10;
        }
    */
        int[] array = {10, 20, 30};
  
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+":");
   
            int val = array[j];
            System.out.println(val);
        }
    
    }    
}
