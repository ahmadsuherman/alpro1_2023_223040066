package BEGINNER;

import java.util.Scanner;

public class HitungPersegiPanjang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int panjang, lebar, luas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menghitung Luas Persegi Panjang");
		System.out.println("===============================");
		
		
		System.out.print("Masukkan panjang: "); panjang = sc.nextInt(); 
		System.out.print("Masukkan lebar: "); lebar = sc.nextInt(); 
		
		luas = panjang * lebar;
		
		System.out.println("Luasnya: "+ luas);
	}

}
