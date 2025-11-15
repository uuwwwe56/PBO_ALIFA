package tugas6;

import java.util.Arrays;

public class VariasiArray {
    public static void main(String[] args) {
        
//        Cara pertama
         int arr1[]={2,5,4,7,6};
          
//          CAra kedua
         int []arr2= new int[3];
         arr2[0]=30;
         arr2[1]=11;
         arr2[2]=91;
         
//         CAra ketiga
        int arr3[]=new int[]{1,3,2,4,6};
        
       System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));
    }
    
}
