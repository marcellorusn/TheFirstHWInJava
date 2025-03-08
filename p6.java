
//Sa se determine suma primelor n numere impare – ‘n’ citit de la tastatura
import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu numarul: ");
		int n = scanner.nextInt();
		
		int suma = n * n;
		
		System.out.println("Raspunsul este: "+suma);
		
		scanner.close();
	}

}
