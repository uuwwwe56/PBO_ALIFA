package tugas9;

// ==============================
// SUPERCLASS
// ==============================
class Hewan {
    String jenisKaki;

    Hewan(String jenisKaki) {
        this.jenisKaki = jenisKaki;
    }

    void tampilJenis() {
        System.out.println("- hewan berkaki " + jenisKaki);
    }
}

// ==============================
// SUBCLASS
// ==============================
class HewanDuaKaki extends Hewan {
    HewanDuaKaki() {
        super("dua");
    }

    void contoh() {
        System.out.println("- hewan berkaki dua: kangguru, ayam, bebek, dll");
    }
}

class HewanEnamKaki extends Hewan {
    HewanEnamKaki() {
        super("enam");
    }

    void contoh() {
        System.out.println("- hewan berkaki enam: capung, nyamuk, kupu-kupu, dll");
    }
}

class HewanEmpatKaki extends Hewan {
    HewanEmpatKaki() {
        super("empat");
    }

    void contoh() {
        System.out.println("- hewan berkaki empat: kucing, anjing, kuda, dll");
    }
}

class HewanDelapanKaki extends Hewan {
    HewanDelapanKaki() {
        super("delapan");
    }

    void contoh() {
        System.out.println("- hewan berkaki delapan: kepiting, belalang, laba-laba, dll");
    }
}

// ==============================
// MAIN CLASS
// ==============================
public class Sub_SuperClass {
    public static void main(String[] args) {
        System.out.println("Macam-macam hewan:");

        HewanDuaKaki h2 = new HewanDuaKaki();
        HewanEnamKaki h6 = new HewanEnamKaki();
        HewanEmpatKaki h4 = new HewanEmpatKaki();
        HewanDelapanKaki h8 = new HewanDelapanKaki();

        h2.tampilJenis();
        h6.tampilJenis();
        h4.tampilJenis();
        h8.tampilJenis();

        System.out.println("\nContoh hewan:");
        h2.contoh();
        h6.contoh();
        h4.contoh();
        h8.contoh();
    }
}
