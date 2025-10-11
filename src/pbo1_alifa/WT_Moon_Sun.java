package pbo1_alifa;

public class WT_Moon_Sun {
    double bulan;
    double matahari;
    double KC;
    
    double Wb(){
        return bulan/KC;
    }
    
    double WM(){
        return matahari/KC;
    }
}
