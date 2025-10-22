package tugas3;
import java.util.Scanner;
import java.io.*;

public class Scaner_Buffer {
    public static void main(String[] args) throws IOException {
        
//        Scanner → lebih mudah digunakan, bisa langsung membaca berbagai tipe data (int, double, string).
//        BufferedReader → lebih cepat dan efisien untuk input teks besar,
//        tetapi hasilnya berupa string sehingga harus dikonversi manual.   
        

        Scanner inputS=new Scanner(System.in);
        System.out.println("MENGGUNAKAN SCANNER");
        System.out.print("Nama : ");
        String namaS=inputS.nextLine();
        System.out.print("Umur : ");
        String umurS=inputS.nextLine();
        
        System.out.println("Hasil Scanner :"+" Nama "+namaS+" umur "+umurS);
       
        System.out.println("\nMENGGUNAKAN BUFFER READER");
       BufferedReader inputBR = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Nama : ");
        String namaBR=inputBR.readLine();
        System.out.print("Umur : ");
        int umurBR = Integer.parseInt(inputBR.readLine());
        System.out.println("Hasil Scanner :"+" Nama "+namaBR+" umur "+umurBR);
    }
}
