//Sa se determine suma primelor n numere pare – ‘n’ citit de la tastatura
import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu numarul: ");
		int n = scanner.nextInt();
		
		
		int suma = n * (n+1);
		
		System.out.println("Raspunsul este: "+suma);
		
		scanner.close();
	}

}
