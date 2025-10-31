package tugas5;
import java.util.Scanner;
public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int angka=1,total=0,n;
        
        System.out.print("Masukkan banyak angka : ");
        n = input.nextInt();
        
        for(int a=0; a<n; a++){
            System.out.print(angka+" ");
            total+=angka;
            angka+=2;
        }
        System.out.println("\nTotal : "+total);
    }
    
}
