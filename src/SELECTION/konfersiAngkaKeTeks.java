package SELECTION;

import java.util.Scanner;

public class konfersiAngkaKeTeks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ketikkan angka: "); angka = sc.nextInt();
		if (angka == 1) {
			System.out.println("Satu");
		}
		else if (angka == 2) {
			System.out.println("Dua");
		}
		else if (angka == 3) {
			System.out.println("Tiga");
		}
		else if (angka == 4) {
			System.out.println("Empat");
		}
		else {
			System.out.print("Angka Bukan 1 sd 4");
		}
	}
}
