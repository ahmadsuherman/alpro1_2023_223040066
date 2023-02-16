package BEGINNER;

import java.util.Scanner;

public class HelloNama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nama;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan nama anda: "); nama = sc.next();  
		System.out.println("Hello " + nama);
	}

}
