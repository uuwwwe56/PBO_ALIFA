package tugas9;
import java.util.Scanner;

class kubus{
    private double sisi;
    
    public kubus(double sisi){
        this.sisi=sisi;
    }
    
    public double hitung(){
        return sisi*sisi*sisi;
    }
}
public class VKubus {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.print("Volume Kubus : ");
        double k=input.nextDouble();
        
        kubus kbs=new kubus(k);
        System.out.println("Volume Kubus : "+kbs.hitung());
    }
    
}
