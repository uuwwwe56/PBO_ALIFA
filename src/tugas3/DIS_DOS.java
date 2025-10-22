package tugas3;

import java.io.*;

public class DIS_DOS {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        DataOutputStream dos = new DataOutputStream(System.out);

        dos.writeBytes("Masukkan Nama Pembeli: ");
        String nama = dis.readLine();

        dos.writeBytes("Masukkan Total Belanja: ");
        double totalBelanja = Double.parseDouble(dis.readLine());

        dos.writeBytes("Masukkan Diskon (%): ");
        double diskon = Double.parseDouble(dis.readLine());

        // Hitung total setelah diskon
        double potongan = totalBelanja * diskon / 100;
        double totalBayar = totalBelanja - potongan;

        dos.writeBytes("Masukkan Jumlah Uang Bayar: ");
        double bayar = Double.parseDouble(dis.readLine());

        double kembalian = bayar - totalBayar;

        // Cetak struk hasil
        dos.writeBytes("\n=== STRUK PEMBAYARAN ===\n");
        dos.writeBytes("Nama Pembeli   : " + nama + "\n");
        dos.writeBytes("Total Belanja  : Rp " + totalBelanja + "\n");
        dos.writeBytes("Diskon         : " + diskon + "%\n");
        dos.writeBytes("Potongan Harga : Rp " + potongan + "\n");
        dos.writeBytes("Total Bayar    : Rp " + totalBayar + "\n");
        dos.writeBytes("Uang Bayar     : Rp " + bayar + "\n");
        dos.writeBytes("Kembalian      : Rp " + kembalian + "\n");
        dos.writeBytes("==========================\n");
        
    }
}
