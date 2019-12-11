import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetni broj: ");
		int broj = input.nextInt();
		System.out.print("Hailstone sekvenca za broj " + broj + " je: " + broj + " ");
		while (broj != 1) {
			if (broj % 2 == 0) {
				broj = broj / 2;
				System.out.print(broj + " ");
			} else {
				broj = (3 * broj) + 1;
				System.out.print(broj + " ");
			}
		}
		input.close();

	}

}
