package BEGINNER;

import java.util.Scanner;

public class HitungTotalDetik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalDetik, jam, menit, detik;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menghitung Total Detik");
		System.out.println("=======================");
		
		
		System.out.print("Masukkan jam: "); jam = sc.nextInt();  
		System.out.print("Masukkan menit: "); menit = sc.nextInt();
		System.out.print("Masukkan detik: "); detik = sc.nextInt(); 
		
		
		totalDetik = jam * 3600 + menit * 60 + detik;
		
		System.out.println("Total detiknya yaitu: "+ totalDetik);
	}

}
