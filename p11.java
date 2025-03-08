//Sa se afiseze toti divizorii numarului ‘n’ dat.

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu numarul: ");
		int n = scanner.nextInt();

		System.out.println("Divizorii numarului " + n + " sunt:");

		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " "); 

				
				if (i != n / i) {
					System.out.print(n / i + " "); 
				}
			}
		}
		scanner.close();
	}
}