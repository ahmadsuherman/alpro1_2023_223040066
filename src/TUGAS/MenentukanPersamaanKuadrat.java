package TUGAS;

import java.util.Scanner;

public class MenentukanPersamaanKuadrat {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        a = input.nextDouble();

        System.out.print("Masukkan nilai b: ");
        b = input.nextDouble();

        System.out.print("Masukkan nilai c: ");
        c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Persamaan tidak memiliki akar real");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Persamaan memiliki satu akar real: " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Persamaan memiliki dua akar real: " + x1 + " dan " + x2);
        }

        input.close();
    }
}
