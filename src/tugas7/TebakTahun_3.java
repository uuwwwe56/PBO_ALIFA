package tugas7;

import java.util.Scanner;

public class TebakTahun_3 {
    public static int kodeLahir(int bulan, int tanggal) {
        return (bulan * 100) + tanggal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input bulan
        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = scanner.nextInt();
        
        // Input tanggal
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = scanner.nextInt();
        
        // Validasi input
        if (bulan < 1 || bulan > 12) {
            System.out.println("Bulan tidak valid!");
        } else if (tanggal < 1 || tanggal > 31) {
            System.out.println("Tanggal tidak valid!");
        } else {
            // Hitung dan tampilkan kode lahir
            int kode = kodeLahir(bulan, tanggal);
            System.out.println("Kode lahir: " + kode);
            
            // Konversi ke format yang lebih mudah dibaca
            String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                                 "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
            System.out.println("Anda lahir pada: " + tanggal + " " + namaBulan[bulan-1]);
        }
        
        scanner.close();
    }
}