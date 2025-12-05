package tugas9;

class Produk {
    String judul;
    String penulis;

    Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void getInfoProduk() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}

class Komik extends Produk {
    Komik(String judul, String penulis) {
        super(judul, penulis);
    }
}

class Games extends Produk {
    Games(String judul, String penulis) {
        super(judul, penulis);
    }
}

public class KomikGames {
    public static void main(String[] args) {
        Komik komik = new Komik("One Piece", "Eiichiro Oda");
        Games game = new Games("The Witcher 3", "CD Projekt");

        komik.getInfoProduk();
        game.getInfoProduk();
    }
    
}
