package tugas4;
import java.util.Scanner;
public class kasir {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Apakah memiliki kartu member ? (y/n) : ");
        String member=input.next();
        
        System.out.print("Total Belanja : ");
        int total=input.nextInt();
        
        
        int diskon=0;
        
        if(member.equalsIgnoreCase("y")){
            if(total > 500000){
                diskon=50000;
            }else if (total > 100000){
                diskon=15000;
            }
        }else{
            if(total > 100000){
                diskon=10000;
            }
        }
        
         System.out.print("Bayar : ");
         int bayar=input.nextInt();
         
         int totalBayar=total-diskon;
        int kembalian=bayar-totalBayar;
        
         System.out.println("\n=== STRUK BELANJA ===");
        System.out.println("Total Belanja: Rp" + total);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp" + totalBayar);
        System.out.println("Uang Bayar: Rp" + bayar);
        System.out.println("Kembalian: Rp" + kembalian);
        
    }
    
}
