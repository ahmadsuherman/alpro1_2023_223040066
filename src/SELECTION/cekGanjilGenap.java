package SELECTION;

import java.util.Scanner;

public class cekGanjilGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bilangan;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ketikkan bilangan: "); bilangan = sc.nextInt();
		if (bilangan % 2 == 1) {
			System.out.println("Bilangan Ganjil");
		}
		else {
			System.out.println("Bilangan Genap");
		}
	}
}
