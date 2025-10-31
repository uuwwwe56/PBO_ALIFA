package tugas5;

public class Half_FullTriangle {
    public static void main(String[] args) {
        int tinggi = 5;

        System.out.println("Half Triangle:");
        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi di sebelah kiri
            for (int j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\nFull Triangle:");
       // Bagian atas (segitiga sama kaki)
        for (int i = 1; i <= tinggi; i++) {
            for (int j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bagian bawah (segitiga terbalik)
        for (int i = tinggi - 1; i >= 1; i--) {
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
