//Sa se afiseze toti divizorii primi ai numarului ‘n’ dat.

import java.util.Scanner;

public class p12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu numarul: ");
		int n = scanner.nextInt();

		System.out.println("Divizorii primi " + n + " sunt:");
		boolean estePrim = true;
		if (n <= 1) {
			estePrim = false;
		} else {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					estePrim = false;
					System.out.print(i + " ");

					if (i != n / i) {
						System.out.print(n / i + " ");
					}
				}
			}

		}
		scanner.close();

	}
}