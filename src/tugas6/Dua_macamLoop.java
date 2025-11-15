package tugas6;

public class Dua_macamLoop {
    public static void main(String[] args) {
         int[] angka = {12, 4, 5, 2, 6};

     
        System.out.println("Menggunakan perulangan for:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

      
        System.out.println("Menggunakan perulangan for-each:");
       for(int a:angka){
           System.out.print(a+" ");
       }
    }
    
}
