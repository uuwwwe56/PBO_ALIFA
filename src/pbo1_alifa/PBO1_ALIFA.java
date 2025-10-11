package pbo1_alifa;

public class PBO1_ALIFA {
    public static void main(String[] args) {
        

          segitiga s1=new segitiga();
          s1.a=6;
          s1.b=8;
         
            System.out.println("NO 5&6 Cari Luas,nilai C dan KELILING SEGITIGA");
        System.out.println("Alas (a)     : " + s1.a);
        System.out.println("Tinggi (b)   : " + s1.b);
        System.out.println("Luas         : " + s1.luas()); //NO 5
        System.out.println("Sisi miring c: " +s1.SisiMiring()); //NO 6
        System.out.println("Keliling     : " + s1.Keliling());  //NO 6
        
//        SOAL NO 7 
          String a="Saya Belajar Java"; 
          String b="Saya Belajar Java"; 
          
    
        System.out.println("\nNO 7 Manipulasi String");
          System.out.println("String a : "+a.toLowerCase());
          System.out.println("String a : "+a.toUpperCase());
          
//          SOAL 8 WAKTU TEMPUH CAHAYA
        WT_Moon_Sun m1=new WT_Moon_Sun();
        m1.bulan=384400;
        m1.matahari=152.1e6;
        
        System.out.println("\nNo 8 WT CAHAYA BULAN DAN MATAHARI");
        System.out.println("Dari Bumi ke Bulan : " + m1.Wb());
        System.out.println("Dari Bumi Ke Matahari" + m1.WM());
          
//         //SOAL 9 Konversi Suhu
        System.out.println("\nSOAL 9 Konversi Suhu");
        konversiSuhu KS1=new konversiSuhu();
        KS1.C=10;
        KS1.F=15;
        KS1.R=5;
        
        KS1.celciusFahrenheit();
        KS1.celciusReamur();
        KS1.fahrenheitReamur();
    }
    
}
