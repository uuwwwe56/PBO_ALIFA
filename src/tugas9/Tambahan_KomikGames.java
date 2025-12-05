package tugas9;

class Produk2 {
    String judul;
    String penulis;

    Produk2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void getInfoProduk() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}

class Komik2 extends Produk2 {
    int jumlahHalaman;

    Komik2(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    void getInfoProduk() {
        super.getInfoProduk();
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
}

class Games2 extends Produk2 {
    int waktuMain;

    Games2(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    void getInfoProduk() {
        super.getInfoProduk();
        System.out.println("Waktu Main: " + waktuMain + " jam");
    }
}

public class Tambahan_KomikGames {
    public static void main(String[] args) {
         Komik2 komik = new Komik2("Naruto", "Masashi Kishimoto", 700);
        Games2 game = new Games2("GTA V", "Rockstar Games", 120);

        komik.getInfoProduk();
        game.getInfoProduk();
    }
}
