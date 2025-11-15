package tugas6;
import java.util.Arrays;
import java.util.Scanner;
public class VariabelArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah array : ");
        int n = input.nextInt();
        
        int arr []=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-"+(i+1)+": ");
            arr[i]=input.nextInt();
        }
        int max=arr[0],min=arr[0];
        int maxIndex=0,minIndex=0,total=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
            total+=arr[i];
        }
        System.out.println("\nNilai Terbesar : "+max);
        System.out.println("Nilai Terkecil : "+min);
        System.out.println("Jumlah : "+total);
        double rata=(double)total/n;
        System.out.println("Rata-rata : "+rata);
        
        int ToIndexGen=0;
        for (int i = 1; i < n; i+=2) {
            ToIndexGen+=arr[i];
        }
        
         System.out.println("Jumlah elemen berindeks genap: " + ToIndexGen);
         // cek hasil penjumlahan ganjil/genap
        // Misal kita cek sumOddIndex (bisa disesuaikan)
        System.out.println("Hasil penjumlahan indeks ganjil adalah " + 
                          (ToIndexGen % 2 == 0 ? "genap" : "ganjil"));
        
        // Mengurutkan array
        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
        
       
    }
    
}
