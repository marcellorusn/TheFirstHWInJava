import java.util.Scanner;

//Sa se afiseze cifra minima a unui numar.
public class p18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introdu numarul: ");
		int n = scanner.nextInt();

		int cifraMin = 9;

		while (n > 0) {
			int cifra = n % 10;
			if (cifra < cifraMin) {
				cifraMin = cifra;
			}
			n /= 10;
		}

		System.out.println("Min: " + cifraMin);
		scanner.close();
	}
}