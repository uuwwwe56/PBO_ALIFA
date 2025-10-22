package tugas3;
import java.util.Scanner;
public class Novel {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        System.out.println("=== PERHITUNGAN WAKTU CETAK NOVEL ===");
        
        System.out.print("Banyaknya novel: ");
        int jumlahNovel = input.nextInt();
        
        System.out.print("Tebal lembar per novel: ");
        int tebalPerNovel = input.nextInt();
        
        // Total lembar
        int totalLembar = jumlahNovel * tebalPerNovel;
        
        // Waktu total dalam detik (1 lembar/detik)
        int totalDetik = totalLembar;
        
        // Konversi ke hari, jam, menit, detik
        int hari = totalDetik / 86400;
        int sisaHari = totalDetik % 86400;
        
        int jam = sisaHari / 3600;
        int sisaJam = sisaHari % 3600;
        
        int menit = sisaJam / 60;
        int detik = sisaJam % 60;
        
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total lembar: " + totalLembar + " lembar");
        System.out.println("Waktu yang diperlukan:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
        
        input.close();
    }
}
