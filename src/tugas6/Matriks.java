package tugas6;

import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      int row,col;
      
        System.out.print("Masukan Jumlah Baris Matrik : ");
        row=input.nextInt();
        System.out.print("Masukan Jumlah Kolom Matrik : ");
        col=input.nextInt();
        
        int matrik1 [][]=new int [row] [col];
        int matrik2 [][]=new int [row] [col];
        int jumlah [][]=new int [row] [col];
        
//        Matrik pertama
        System.out.println("Matrik ke1");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("Masukan angka[%d] [%d] : ",i,j);
                matrik1[i][j]=input.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("Matrik kedua");
        System.out.println("Matrik ke2");
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("Masukan angka[%d] [%d] : ",i,j);
                matrik2[i][j]=input.nextInt();
            }
        }
         
         
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                jumlah[i][j]=matrik1[i][j]+matrik2[i][j];
            }
        }
         
          System.out.println("Penjumlahan");
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(jumlah[i][j]+"\t");
            }
             System.out.println();
        }
         input.close();
    }
    
}
