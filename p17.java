import java.util.Scanner;

//Sa se afiseze cifra maxima a unui numar.
public class p17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introdu numarul: ");
		int n = scanner.nextInt();

		int cifraMax = 0;

		while (n > 0) {
			int cifra = n % 10;
			if (cifra > cifraMax) {
				cifraMax = cifra;
			}
			n /= 10;
		}

		System.out.println("Max: " + cifraMax);
		scanner.close();
	}
}