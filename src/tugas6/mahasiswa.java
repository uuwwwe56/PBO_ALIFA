package tugas6;
import java.util.Scanner;
public class mahasiswa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa : ");
        int n=input.nextInt();
         input.nextLine();
         
        String nama[]=new String[n];
        int nilai[]=new int[n];
        String status[]=new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-"+(i+1));
            System.out.print("Nama : ");
            nama[i]=input.nextLine();
            System.out.print("Nilai : ");
            nilai[i]=input.nextInt();
            input.nextLine();   
            status[i]= (nilai[i] > 50) ?  "LULUS" : "TIDAK LULUS";     
        }
        
        System.out.println("");
        System.out.println("|NO\t |Nama\t |Nilai\t |Status");
         for(int a=0; a<n; a++){
            System.out.printf("|%d\t |%s\t |%d\t |%s\n",
                   (a+1),nama[a],nilai[a],status[a] );
        }
    }
}
