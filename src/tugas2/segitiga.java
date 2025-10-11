package tugas2;

public class segitiga {
     double a,b;
   
   
   //hitung LUAS NO 5
   double luas(){
       return 0.5*a*b;
   }
    
//   menghitung sisi miring (c) menggunakan rumus Pythagoras NO 6
     public double SisiMiring() {
        return Math.sqrt((a * a) + (b * b));
    }

    // Method untuk menghitung keliling segitiga NO 6
    public double Keliling() {
        double c = SisiMiring();
        return a + b + c;
    }
}
