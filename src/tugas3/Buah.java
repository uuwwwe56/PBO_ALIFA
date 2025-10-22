package tugas3;

import java.io.*;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("MENGHITUNG BUAH");
        
        System.out.print("Jumlah mangga yang dbeli :");
        int mangga=Integer.parseInt(br.readLine());
        System.out.print("Jumlah Tetangga : ");
        int tetngga=Integer.parseInt(br.readLine());
        System.out.print("Jumlah jambu per tetangga :");
        int jambu=Integer.parseInt(br.readLine());
        System.out.print("Jumlah mangga Busuk : ");
        int ManggaB=Integer.parseInt(br.readLine());
        
       int totalJambu=tetngga*jambu;
       int totalmangga=mangga-ManggaB;
       int totalBuah=totalJambu+totalmangga;
        
         System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total mangga baik: " + totalmangga + " pcs");
        System.out.println("Total jambu: " + totalJambu + " pcs");
        System.out.println("Total semua buah: " + totalBuah + " pcs");
        
        br.close();
    }
}
