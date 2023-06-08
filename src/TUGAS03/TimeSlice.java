package TUGAS03;

import java.util.Scanner;

public class TimeSlice {

	public static void main(String[] args) {
		
		int max, beras, kesempatan, waktu, sisa_beras, butuh_waktu;
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah beras yang mau ditumbuk: ");
        
        beras = scanner.nextInt();
        kesempatan = 0;
        max = 3;
        waktu = 5;
        sisa_beras = 0;
        butuh_waktu = waktu * beras;
        
        while(beras > 0 && kesempatan < 10) {
        	kesempatan = kesempatan + 1;
        	beras = beras - max;
        	sisa_beras = beras - max;
        }
        
        if(sisa_beras < 0) {
        	sisa_beras = 0;
        }
        
        System.out.println("Proses akan dilayani sebanyak " + kesempatan + " kesempatan.");
        System.out.println("Waktu yang dibutuhkan " + butuh_waktu + " detik.");
        System.out.println("Sisa beras " + sisa_beras + " liter.");
        
	}
}
