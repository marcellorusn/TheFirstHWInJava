import java.util.Scanner;
//Sa se calculeze media aritmetica a n numere – ‘n’ citit de la tastatura

public class p7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introdu numarul: ");
		int n = scanner.nextInt();

		int suma = 0;

		for (int i = 0; i < n; i++) {
			suma = suma + scanner.nextInt();
		}
		
		int media = suma / n;

		System.out.println("Raspunsul este: " + media);

		scanner.close();

	}
}
