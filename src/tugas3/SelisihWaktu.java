package tugas3;
import java.util.Scanner;
public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PERHITUNGAN SELISIH WAKTU ===");
        
        
        System.out.println("Waktu Pertama:");
        System.out.print("Jam: ");
        int j1 = input.nextInt();
        System.out.print("Menit: ");
        int m1 = input.nextInt();
        System.out.print("Detik: ");
        int d1 = input.nextInt();
        
        
        System.out.println("\nWaktu Kedua:");
        System.out.print("Jam: ");
        int j2 = input.nextInt();
        System.out.print("Menit: ");
        int m2 = input.nextInt();
        System.out.print("Detik: ");
        int d2 = input.nextInt();
        
        // Konversi ke detik
        int totalDetik1 = (j1 * 3600) + (m1 * 60) + d1;
        int totalDetik2 = (j2 * 3600) + (m2 * 60) + d2;
        
        // Hitung selisih
        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);
        
        // Konversi kembali ke jam, menit, detik
        int jam = selisihDetik / 3600;
        int sisa = selisihDetik % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;
        
        System.out.println("\nSelisih Waktu: " + jam + " jam, " + menit + " menit, " + detik + " detik");
        
        input.close();
    }
}
