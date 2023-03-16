package SELECTION;

import java.util.Scanner;

public class cekPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ketikkan password: "); password = sc.next();
		if (password.contentEquals("dini")) {
			System.out.println("Login Sukses");
		}
		else {
			System.out.println("Login Gagal");
		}
	}

}
