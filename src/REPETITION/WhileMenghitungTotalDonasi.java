package REPETITION;

import java.util.Scanner;

public class WhileMenghitungTotalDonasi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, donasi = 0, jumlahDonasi = 0, jumlahMahasiswa;

		Scanner input = new Scanner(System.in);
		System.out.printf("Masukkan jumlah mahasiswa: "); jumlahMahasiswa = input.nextInt();
		
		while (i <= jumlahMahasiswa) {
			System.out.printf("Masukkan jumlah donasi ke " + i + ": "); donasi = input.nextInt();
			jumlahDonasi = jumlahDonasi + donasi;
			i++;
		}
		
		System.out.println("Jumlah Donasi Keseluruhan = "+jumlahDonasi);
	}
}
