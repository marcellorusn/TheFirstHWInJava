import java.util.Scanner;

//Sa se verifice daca un numar n diferit de 0 sau 1 este prim sau nu.
public class p9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Verifica numarul daca este prim: ");
		int n = scanner.nextInt();

		boolean estePrim = true;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				estePrim = false;
				break;
			}
		}

		if (estePrim) {
			System.out.println("Este prim.");
		} else {
			System.out.println("Nu este prim.");
		}

		scanner.close();
	}

}
