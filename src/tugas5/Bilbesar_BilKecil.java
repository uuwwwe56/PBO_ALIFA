package tugas5;
import java.util.Scanner;
public class Bilbesar_BilKecil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("Program Menentukan Bilangan Terbesar dan Terkecil");
         int [] angka= new int[10];
         
         for(int a=0; a<10; a++){
             System.out.print("Masukan angka ke- "+(a+1)+" : ");
             angka[a]=input.nextInt();
         }
         
        int max=angka[0],min=angka[0];
        for(int a=0; a<10; a++){
            if(angka[a]>max) max=angka[a];
            if(angka[a]<min) min=angka[a];
        }

         System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);
        System.out.println();
         
    }
}
