package RECORD;

import java.util.Scanner;

public class KelolaJamDenganValidasi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jam T = new Jam();
		
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Jam: ");
			T.H = sc.nextInt();
		} while (T.H < 0 || T.H >= 24);
		do {
			System.out.println("Menit: ");
			T.i = sc.nextInt();
		} while (T.i < 0 || T.i >= 60);
		do {
			System.out.println("Detik: ");
			T.s = sc.nextInt();
		} while (T.s < 0 || T.s >= 60);
		
		System.out.println("Waktu: "+ T.H +':'+ T.i +':'+ T.s);
	}
}
