import java.util.Scanner;

//Sa se afiseze factorialul unui numar n citit de la tastatura. (FACT=1*2*3*...*n)
public class p8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu numarul: ");
		int n = scanner.nextInt();

		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Raspunsul este: " + factorial);
		
		scanner.close();
	}

}
