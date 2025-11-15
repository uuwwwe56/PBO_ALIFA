package tugas6;
import java.util.Scanner;

class T extends Thread {
    private String n; 

    public T(String n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Thread " + n + " sedang berjalan...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " - Iterasi ke-" + i);
            try {
                Thread.sleep(1000); // Simulasi jeda 1 detik
            } catch (InterruptedException e) {
                System.out.println(n + " terinterupsi.");
            }
        }
        System.out.println("Thread " + n + " selesai.");
    }
}
public class KelasBAru {
    public static void main(String[] args) {
       T t1 = new T("Thread-1");
        T t2 = new T("Thread-2");

        t1.start();
        t2.start();

        System.out.println("Thread utama selesai.");
        
    }
}