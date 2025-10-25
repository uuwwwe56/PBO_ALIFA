package tugas4;
import  java.util.Scanner;
public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukkan NIK : ");
        String nik=input.nextLine();
        System.out.print("Masukkan nama : ");
        String nama=input.nextLine();
        System.out.print("Kode golongan (1-4) : ");
        int gol=input.nextInt();
        
        double gp=0;
        switch (gol) {
            case 1: gp=1200000; break;
            case 2: gp=1500000; break;
            case 3: gp=1750000; break;
            case 4: gp=2000000; break;
            default:
                System.out.println("Kode golongan tidak valid!");
        }
        double TP=0,TA=0;
        if(gol==1 || gol==4){
            TP=0.1*gp;
        }
        
        if(gol==4){
            System.out.print("Masukkan jumlah anak: ");
            int jmlAnak = input.nextInt();
            TA = 0.05 * gp * jmlAnak;
        }
        
         double GBersih = gp + TP + TA;
        System.out.println("\n===== Gaji Karyawan =====");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gp);
        System.out.println("Tunjangan Pasangan: Rp" + TP);
        System.out.println("Tunjangan Anak: Rp" + TA);
        System.out.println("Gaji Bersih: Rp" + GBersih);
        
        
    }
    
}
