package SELECTION;

import java.util.Scanner;

public class cekPositifNegatifNol {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bilangan;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ketikkan bilangan: "); bilangan = sc.nextInt();
		if (bilangan > 0) {
			System.out.println("Bilangan Positif");
		}
		else if (bilangan < 0) {
			System.out.println("Bilangan Negatif");
		}
		else {
			System.out.print("Bilangan Nol");
		}
	}
}
