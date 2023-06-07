package AFTER_UTS;

import java.util.Scanner;

public class MenghitungGajiPegawai {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Masukkan golongan gaji pegawai: ");
      int golonganGaji = input.nextInt();
      
      System.out.print("Masukkan jumlah hari kerja dalam sebulan: ");
      int jumlahHari = input.nextInt();
      
      System.out.print("Masukkan upah harian pegawai: ");
      double upahHarian = input.nextDouble();
      
      // Menghitung gaji pokok berdasarkan golongan gaji
      double gajiPokok = 0;
      switch(golonganGaji) {
         case 1:
            gajiPokok = 700000;
            break;
         case 2:
            gajiPokok = 1000000;
            break;
         case 3:
            gajiPokok = 1400000;
            break;
         case 4:
            gajiPokok = 1600000;
            break;
         default:
            System.out.println("Golongan gaji yang dimasukkan tidak valid!");
            System.exit(0);
      }
      
      double GP = gajiPokok + (jumlahHari * upahHarian);
      
      System.out.println("\n==== Hasil Perhitungan Gaji Pegawai ====");
      System.out.println("Gaji pokok pegawai: " + GP);
   }
}
