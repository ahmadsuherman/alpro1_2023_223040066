package REPETITION;

import java.util.Scanner;

public class CekPasswordDenganLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		int limit = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan password: "); password = input.next();
		
		while (!password.contentEquals("$$$") && limit <3) {
			System.out.print("Masukkan password: "); password = input.next();
			limit++;
		}
		if(password.contentEquals("$$$"))
			System.out.println("Login sukses");
		else
			System.out.println("Login gagal");
	}
}
