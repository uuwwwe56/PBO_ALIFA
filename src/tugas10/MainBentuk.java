
package tugas10;
// ==============================
// KELAS INDUK
// ==============================
abstract class Bentuk {
    abstract double luas();
}

// ==============================
// KELAS TURUNAN
// ==============================
class PersegiPanjang extends Bentuk {
    double panjang, lebar;

    PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    @Override
    double luas() {
        return panjang * lebar;
    }
}

class BujurSangkar extends Bentuk {
    double sisi;

    BujurSangkar(double s) {
        sisi = s;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }
}

class Segitiga extends Bentuk {
    double alas, tinggi;

    Segitiga(double a, double t) {
        alas = a;
        tinggi = t;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }
}

class Lingkaran extends Bentuk {
    double jari;

    Lingkaran(double r) {
        jari = r;
    }

    @Override
    double luas() {
        return Math.PI * jari * jari;
    }
}

// ==============================
// MAIN CLASS
// ==============================
public class MainBentuk {
    public static void main(String[] args) {

        Bentuk[] bentuk = new Bentuk[4];
        bentuk[0] = new PersegiPanjang(10, 5);
        bentuk[1] = new BujurSangkar(6);
        bentuk[2] = new Segitiga(8, 4);
        bentuk[3] = new Lingkaran(7);

        for (Bentuk b : bentuk) {
            System.out.println("Luas = " + b.luas());
        }
    }
}

