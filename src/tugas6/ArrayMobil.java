package tugas6;

import java.util.Arrays;

public class ArrayMobil {
    public static void main(String[] args) {
          String mobil[]={"Tesla","Suzuki","Civic","Mazda","BMW"};
        
        System.out.println(Arrays.toString(mobil));
        
        for(int a=0; a<mobil.length; a++){
            if(mobil[a].equalsIgnoreCase("Suzuki")){
                mobil[a]="Honda";
                System.out.println("Nilai pada indeks " + a + " diubah dari Suzuki menjadi " + mobil[a]);
            }
        }
        System.out.println(Arrays.toString(mobil));
    }
}
