package tugas5;
public class Increment {
    public static void main(String[] args) {
        int a = 0, b = 0;
        System.out.println("Menggunakan i++:");
        while (a < 5) {
            System.out.println("a = " + a);
            a++;
        }

        System.out.println("\nMenggunakan ++i:");
        while (b < 5) {
            ++b;
            System.out.println("b = " + b);
        }
    }
    
}
