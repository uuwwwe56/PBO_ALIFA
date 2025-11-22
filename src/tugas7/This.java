package tugas7;

class mhs{
    String nama,npm,kelas;

    public mhs(String npm, String nama, String kelas) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
    }
    
    void tampil(){
        System.out.println("NPM : "+this.npm);
        System.out.println("Nama : "+this.nama);
        System.out.println("Kelas : "+this.kelas);
    }
}

public class This {
    public static void main(String[] args) {
        mhs m1 = new mhs("552012","Algan", "IF-A");
        m1.tampil();
        
    }
    
}
