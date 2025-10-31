package tugas5;
import java.util.Scanner;
public class Penjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,angka,total=0;
        
        System.out.print("Masukan jumlah bilangan : ");
         n = input.nextInt();
        
        for(int a=0; a<n; a++){
            System.out.print("Angka ke- "+(a+1)+" : ");
            angka=input.nextInt();
            total+=angka;
        }
        System.out.println("Total : "+total);
        double rata=(double) total/n;
        System.out.println("Rata-rata : "+rata);
    }
}
