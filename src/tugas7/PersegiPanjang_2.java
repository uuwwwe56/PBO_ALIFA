package tugas7;

public class PersegiPanjang_2 {
    public static void main(String[] args) {
        persegiPanjang pp = new persegiPanjang(6,7);
        
        System.out.println("Keliling Persegi Panjang : "+pp.keliling());
    }
    
}

 class persegiPanjang{
     int p,l;

    public persegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }
     
     int keliling(){
         return 2*(p+l);
     }
     
     
 }