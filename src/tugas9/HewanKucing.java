package tugas9;
import java.util.Scanner;

class Hewan{
    String nama;
    
    Hewan(String nama){
        this.nama=nama;
    }
    
    void makan(){
        System.out.println(nama+" sedang makan");
    }
}

class Kucing extends Hewan{
    
   Kucing(String nama){
    super(nama);
   }
   
   void display(){
       System.out.println("Nama hewan : "+nama);
   }
}

public class HewanKucing  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Nama hewan : ");
        String nama=input.nextLine();
        
        System.out.println("");
        Kucing k=new Kucing(nama);
        k.display();
        k.makan();
         
    }
    
}
