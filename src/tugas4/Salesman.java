package tugas4;
import java.util.Scanner;
public class Salesman {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     
     double pndptn,komisi=0,total=0,jasa=0;
        System.out.print("Pendapatan : ");
        pndptn=input.nextDouble();
        
        if(pndptn <= 2000000){
            jasa=100000;
            komisi=jasa*0.1;
        }else if(pndptn > 2000000 && pndptn <= 5000000){
            jasa=200000;
            komisi=jasa*0.15;
        }else if(pndptn > 5000000){
            jasa=300000;
            komisi=jasa * 0.2;
        }
        
        total=jasa+komisi;
        System.out.println("Uang jasa : "+jasa);
        System.out.println("Komisi : "+komisi);
        System.out.println("Total Pendapatan : "+total);
    }
}
