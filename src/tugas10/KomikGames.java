package tugas10;

abstract class Produk {

    // SOAL 2: protected
    protected String judul;
    protected String penulis;

    // Constructor
    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // SOAL 3: Getter & Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // SOAL 4: abstract method
    abstract void getInfoProduk();
}

// ==============================
// SUBCLASS KOMIK
// ==============================
class Komik extends Produk {

    private int jumlahHalaman;

    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    // SOAL 1: Override method
    @Override
    void getInfoProduk() {
        System.out.println("=== DATA KOMIK ===");
        System.out.println("Judul          : " + judul);
        System.out.println("Penulis        : " + penulis);
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }
}

// ==============================
// SUBCLASS GAMES
// ==============================
class Games extends Produk {

    private int waktuMain;

    public Games(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    // SOAL 1: Override method
    @Override
    void getInfoProduk() {
        System.out.println("=== DATA GAMES ===");
        System.out.println("Judul      : " + judul);
        System.out.println("Developer  : " + penulis);
        System.out.println("Waktu Main : " + waktuMain + " jam");
    }
}

// ==============================
// MAIN CLASS
// ==============================
public class KomikGames {
    public static void main(String[] args) {

        Produk komik = new Komik("Naruto", "Masashi Kishimoto", 700);
        Produk game  = new Games("GTA V", "Rockstar Games", 120);

        komik.getInfoProduk();
        System.out.println();
        game.getInfoProduk();
    }
}

