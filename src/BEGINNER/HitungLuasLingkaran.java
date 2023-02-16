package BEGINNER;

import java.util.Scanner;

public class HitungLuasLingkaran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Phi = 3.14;
		double jariJari, luas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menghitung Luas Lingkaran");
		System.out.println("=========================");
		
		
		System.out.print("Masukkan jari-jari lingkaran: "); jariJari = sc.nextDouble(); 
		
		luas = Phi * jariJari * jariJari;
		
		System.out.println("Luasnya: "+ luas);
	}

}
