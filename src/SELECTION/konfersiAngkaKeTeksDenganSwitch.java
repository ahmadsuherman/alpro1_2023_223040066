package SELECTION;

import java.util.Scanner;

public class konfersiAngkaKeTeksDenganSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ketikkan angka: "); angka = sc.nextInt();
		switch (angka) {
		case 1 : System.out.println("Satu"); break;
		case 2 : System.out.println("Dua"); break;
		case 3 : System.out.println("Tiga"); break;
		case 4 : System.out.println("Empat"); break;
			default:System.out.println("Bukan 1-4");
		}
	}
}
