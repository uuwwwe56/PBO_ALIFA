package tugas3;
import java.util.Scanner;
public class Sentripental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== MeNGHITUNG GAYA SENTRIPETAL ===");
        
        System.out.print("Masukkan massa (kg): ");
        int massa = input.nextInt();
        
        System.out.print("Masukkan kecepatan (m/s): ");
        int kecepatan = input.nextInt();
        
        System.out.print("Masukkan jari-jari (m): ");
        int jariJari = input.nextInt();
        
        // Rumus F = (m * v^2) / r
        double gs = (massa * Math.pow(kecepatan, 2)) / jariJari;
        
        System.out.println("Gaya Sentripetal: " + gs + " Newton");
        
        input.close();
    }
}
