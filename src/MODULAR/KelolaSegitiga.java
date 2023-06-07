package MODULAR;

import java.util.Scanner;

public class KelolaSegitiga {
	
	static void HitungLuasSegitiga() {
		double alas, tinggi, luas;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Alas: "); alas = sc.nextInt();
		System.out.print("Tinggi: "); tinggi = sc.nextInt();
		
		luas = alas * tinggi / 2;
		
		System.out.println("Luas segiga: "+ luas);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HitungLuasSegitiga();
		
	}
}
