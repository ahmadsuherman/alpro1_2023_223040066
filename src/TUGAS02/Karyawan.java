package TUGAS02;

import java.util.Scanner;

public class Karyawan {

//	Tugas 2
//	1. Menambahkan kode pegawai dengan tipe data String
//	2. Menambahkan kehadiran dengan tipe data integer/number
//	3. Menerima input kode pegawai
//	4. Menerima input kehadiran
//	5. Menambahkan gaji total dengan uang makan per kehadiran, dengan uang makan senilai 50 ribu.
	
	int gol;
	double gapok, tunjangan, bonus, gatot;
	
	String kodeP;
	int hadir;
	
	void bacaKaryawan() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Gol: ");
		gol = sc.nextInt();
		
		System.out.print("Kode pegawai: ");
		kodeP = sc.next();
		
		System.out.print("Hadir: ");
		hadir = sc.nextInt();
		
		setGapokBonus();
		
		gatot = HitungGatot();
		
	}
	
	void setGapokBonus() {
		switch(gol) {
			case 1: 
				gapok = 2000000;
				bonus = 0;
				tunjangan = gapok * 0.02;
				break;
			case 2: 
				gapok = 2500000;
				bonus = 100000;
				tunjangan = gapok * 0.02;
				break;
			case 3: 
				gapok = 3000000;
				bonus = 200000;
				tunjangan = gapok * 0.03;
				break;
			case 4: 
				gapok = 4000000;
				bonus = 300000;
				tunjangan = gapok * 0.04;
				break;
			default:
				System.out.print("Tidak valid");
				break;
		}
	}
	
	double HitungTunjangan() {
		return gapok * 0.2;
	}
	
	double HitungGatot() {
		double gajiTotal;
		
		gajiTotal = gapok + bonus + tunjangan + (50000 + hadir);
		return gajiTotal;
	}
	
	void TulisKaryawan() {
		System.out.println("Gol :" + gol + ", "
				+ "Gapok: " + gapok + ", "
				+ "Bonus: " + bonus + ", "
				+ "Tunjangan: " + tunjangan + ", "
				+ "Gatot: " + gatot + ", "
				+ "Kode Pegawai: " + kodeP + ", "
				+ "Hadir: " + hadir);
	}
	
	public static void main(String[] args) {
		Karyawan K = new Karyawan();
		K.bacaKaryawan();
		K.TulisKaryawan();
	}

}
