package tugas10;
// ==============================
// INTERFACE
// ==============================
interface Data {
    void tampilData();
}

// ==============================
// IMPLEMENTASI INTERFACE
// ==============================
class Universitas implements Data {

    String nama, alamat, telepon, provinsi, negara;

    Universitas() {
        nama = "Universitas Suryakancana";
        alamat = "Pasir Gede";
        telepon = "08123-3210-3123";
        provinsi = "Jawa Barat";
        negara = "Indonesia";
    }

    @Override
    public void tampilData() {
        System.out.println("=================================");
        System.out.println("        Data Universitas Cianjur");
        System.out.println("=================================");
        System.out.println("Nama Universitas : " + nama);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Telepon          : " + telepon);
        System.out.println("Provinsi         : " + provinsi);
        System.out.println("Negara           : " + negara);
    }
}

// ==============================
// MAIN CLASS
// ==============================
public class UniversitasApp {
    public static void main(String[] args) {

        Data u = new Universitas();
        u.tampilData();
    }
}

