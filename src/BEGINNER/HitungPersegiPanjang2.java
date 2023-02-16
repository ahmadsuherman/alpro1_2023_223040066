package BEGINNER;

import java.util.Scanner;

public class HitungPersegiPanjang2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float panjang, lebar, luas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menghitung Luas Persegi Panjang");
		System.out.println("===============================");
		
		
		System.out.print("Masukkan panjang: "); panjang = sc.nextFloat(); 
		System.out.print("Masukkan lebar: "); lebar = sc.nextFloat(); 
		
		luas = panjang * lebar;
		
		System.out.println("Luasnya: "+ luas);
	}

}
