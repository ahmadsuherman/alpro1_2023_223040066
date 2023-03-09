package SELECTION;

import java.util.Scanner;

public class cekTemperaturWujudAir {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatur;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ketikkan temperatur: "); temperatur = sc.nextInt();
		if (temperatur <= 0) {
			System.out.println("Padat");
		}
		else if (temperatur <= 100) {
			System.out.println("Cair");
		}
		else {
			System.out.print("Gas");
		}
	}
}
