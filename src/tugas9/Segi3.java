package tugas9;

import java.util.Scanner;

class Segitiga {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}


public class Segi3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       double a,t;
       
        System.out.print("Alas : ");
        a=input.nextDouble();
        System.out.print("Tinggi : ");
        t=input.nextDouble();
        
        Segitiga segitiga = new Segitiga(a,t);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        
    }
    
}
