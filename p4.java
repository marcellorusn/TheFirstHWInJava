//Sa se citeasca de la tastatura 3 numere. Sa se afiseze valoarea minima.
import java.util.Scanner;

public class p4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introdu numerele: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		

		if (a < b && a < c) {
			System.out.println("Cel mai mic numar este: "+ a);	
		}
		
		else if (b < a && b < c) {
			System.out.println("Cel mai mic numar este: "+ b);
		}
		else {
			System.out.println("Cel mai mic numar este: "+ c);
		}
		
		scanner.close();

	}
}
