package tugas7;

class Civitas{
    String nama;

    public Civitas(String nama) {
        this.nama = nama;
    }
    
    void tampil(){
        System.out.println("Nama : "+nama);
    }
    
}

class Mahasiswa extends Civitas {
    String npm;
    
    public Mahasiswa(String nama, String npm) {
        super(nama);
        this.npm = npm;
    }

    @Override
    void tampil() {
     System.out.println("Mahasiswa - Nama: " + nama + " NPM: " + npm);
    }
    
    
}

class Dosen extends Civitas{
    String nip;

    public Dosen(String nama,String nip) {
        super(nama);
        this.nip = nip;
    }

    @Override
    void tampil() {
        System.out.println("Dosen - Nama : "+nama+" NIP : "+nip);
    }
}

class Staf extends Civitas{
    String idStaf;
    public Staf(String nama,String id) {
        super(nama);
        this.idStaf=id;
        
    }

    @Override
    void tampil() {
     System.out.println("Staff - Nama: " + nama + " ID Staff: " + idStaf);
    }
    
    
}



public class CivitasAkademika {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Dr. Andi", "12345");
        Mahasiswa mhs = new Mahasiswa("Budi", "67890");
        Staf staff = new Staf("Citra", "S001");
        
        dosen.tampil();
        mhs.tampil();
        staff.tampil();
    }
}
