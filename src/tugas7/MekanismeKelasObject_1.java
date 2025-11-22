package tugas7;

class Mobil {
    // Atribut
    String merk;
    int tahun;
    
    // Konstruktor
    public Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }
    
    // Method
    public void info() {
        System.out.println("Mobil: " + merk + " Tahun: " + tahun);
    }
 }

public class MekanismeKelasObject_1 {
    public static void main(String[] args) {
          // Pembuatan objek dari kelas
        Mobil m1 = new Mobil("Toyota", 2022);
        m1.info();
    }
}

/*
Mekanisme kelas menjadi objek: Kelas adalah blueprint atau cetakan untuk membuat objek. 
Objek adalah instance (perwujudan) dari kelas. 
Untuk membuat objek dari kelas, kita menggunakan kata kunci new diikuti dengan 
constructor kelas.
*/
