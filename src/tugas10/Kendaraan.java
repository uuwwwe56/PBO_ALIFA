package tugas10;


// ==============================
// SUPERCLASS
// ==============================
abstract class Kendaraann {
    protected String model;

    public Kendaraann(String model) {
        this.model = model;
    }

    abstract void informasi();
}

// ==============================
// SUBCLASS MOBIL
// ==============================
class Mobil extends Kendaraann {
    String nama;
    String jenis;

    public Mobil(String model, String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi() {
        System.out.println("=== MOBIL ===");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

// ==============================
// SUBCLASS PESAWAT
// ==============================
class Pesawat extends Kendaraann {
    String nama;
    String jenis;

    public Pesawat(String model, String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi() {
        System.out.println("=== PESAWAT ===");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

// ==============================
// SUBCLASS KAPAL LAUT
// ==============================
class KapalLaut extends Kendaraann {
    String nama;
    String jenis;

    public KapalLaut(String model, String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi() {
        System.out.println("=== KAPAL LAUT ===");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

// ==============================
// MAIN CLASS
// ==============================
public class Kendaraan {
    public static void main(String[] args) {

        Kendaraann mobil   = new Mobil("Sedan", "Toyota Avanza", "Darat");
        Kendaraann pesawat = new Pesawat("Jet", "Boeing 737", "Udara");
        Kendaraann kapal   = new KapalLaut("Feri", "KMP Merak", "Laut");

        mobil.informasi();
        System.out.println();

        pesawat.informasi();
        System.out.println();

        kapal.informasi();
    }
}
