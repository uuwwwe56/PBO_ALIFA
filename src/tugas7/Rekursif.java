package tugas7;

public class Rekursif {
     public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Faktorial 5: " + faktorial(5));
    }
    
}
