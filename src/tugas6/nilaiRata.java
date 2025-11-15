package tugas6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nilaiRata {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();
        double[] angka = new double[n];
        
        // Input bilangan dengan exception handling
        for (int i = 0; i < n; i++) {
            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    angka[i] = input.nextDouble();
                    valid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan bilangan!");
                    input.nextLine(); // membersihkan input yang salah
                }
            }
        }
        
        // Menghitung rata-rata
        double jumlah = 0;
        for (double anka : angka) {
            jumlah += anka;
        }
        double rata = jumlah / n;
        
        System.out.println("Rata-rata dari bilangan tersebut adalah: " + rata);
        
        input.close();
    }
}
