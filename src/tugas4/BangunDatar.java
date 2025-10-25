package tugas4;
import java.util.Scanner;
public class BangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Menu Luas Bangun Datar ===");
        System.out.print("1.Persegi\n2.Segitiga\n3.Lingkaran\n4.Trapesium\n5.Layang-layang\npilihan : ");
        int pilihan =input.nextInt();
        
        System.out.println("");
        double hasil=0;
        switch (pilihan) {
           case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                
                 hasil=s*s;
                System.out.println("Luas Persegi: " + hasil);
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                
                hasil=0.5*a*t;
                System.out.println("Luas Segitiga: " + hasil);
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                
                hasil=Math.PI * r * r;
                System.out.println("Luas Lingkaran: " + hasil);
                break;
            case 4:
                System.out.print("Masukkan sisi atas: ");
                double ssiAtas = input.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double ssBwh = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double ting = input.nextDouble();
                
                hasil=0.5 * (ssiAtas + ssBwh) * ting;
                System.out.println("Luas Trapesium: " + hasil);
                break;
            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                
                hasil=0.5 * d1 * d2;
                System.out.println("Luas Layang-layang: " + hasil);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        
    }
}
