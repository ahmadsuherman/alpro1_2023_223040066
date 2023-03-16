package REPETITION;

import java.util.Scanner;

public class WhileCekPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan password: "); password = input.next();
		while (!password.contentEquals("$$$")) {
			System.out.print("Masukkan password: "); password = input.next();
			
		}
		System.out.println("Login sukses");
	}

}
