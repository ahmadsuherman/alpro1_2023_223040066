package RECORD;

import java.util.Scanner;

public class KelolaTitik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Titik T = new Titik();
		Titik T2 = new Titik();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("x: ");T.x = sc.nextInt();
		System.out.println("y: ");T.y = sc.nextInt();
		
		System.out.println("x: " + T.x + " y: "+ T.y);
	}

}
