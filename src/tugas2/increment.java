package tugas2;

public class increment {
  public static void main(String[] args) {
        int angka = 5;
        
        System.out.println("Operator Increment");
        
        // Contoh penggunaan operator increment postfix (angka++)
        System.out.println("Nilai awal Angka : "+angka);
        int increment = angka++;
        System.out.println("Setelah Increment angka++");
        System.out.println("Nilai angka : "+angka);
        System.out.println("Increment angka++ : "+increment);
        
          // Contoh penggunaan operator increment prefix (++angka)
        int angka2 = 10;
        System.out.println("");
        System.out.println("Nilai awal Angka : "+angka2);
        int increment2 = ++angka2;
        System.out.println("Setelah Increment ++angka");
        System.out.println("Nilai angka : "+angka2);
        System.out.println("Increment ++angka : "+increment2);
    }
     
}
