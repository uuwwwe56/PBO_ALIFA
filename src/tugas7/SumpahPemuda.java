package tugas7;

public class SumpahPemuda {
     String kalimat;
    
    public SumpahPemuda() {
        this.kalimat = "Kami putra dan putri Indonesia";
    }
    
    public void tampilkanSumpah() {
        System.out.println(kalimat);
        System.out.println("1. Bertanah air satu, tanah air Indonesia");
        System.out.println("2. Berbangsa satu, bangsa Indonesia");
        System.out.println("3. Menjunjung bahasa persatuan, bahasa Indonesia");
    }
    
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampilkanSumpah();
    }
}

