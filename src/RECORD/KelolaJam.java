package RECORD;

import java.util.Scanner;

public class KelolaJam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jam T = new Jam();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Jam: ");T.H = sc.nextInt();
		System.out.println("Menit: ");T.i = sc.nextInt();
		System.out.println("Detik: ");T.s = sc.nextInt();
		
		System.out.println("Waktu: "+ T.H +':'+ T.i +':'+ T.s);
	}
}
