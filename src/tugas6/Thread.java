package tugas6;
import java.util.Scanner;

// Thread anak
class AnakThread extends Thread {
    private int nomor;

    public AnakThread(int nomor) {
        this.nomor = nomor;
    }

    public void run() {
        System.out.println("Thread anak ke-" + nomor + " sedang berjalan.");
    }

    void start() {
        System.out.println("Halo");
    }
}

public class Thread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread anak yang ingin dibuat: ");
        int jumlah = input.nextInt();

        // Thread utama
        System.out.println("Ini adalah thread utama.");

        // Membuat thread anak sebanyak yang diinginkan
        for (int i = 1; i <= jumlah; i++) {
            AnakThread t = new AnakThread(i);
            t.start();
        }
    }
}
