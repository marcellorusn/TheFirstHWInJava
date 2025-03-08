import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {

		System.out.println("Introdu un numar: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			System.out.println("UNU");
			break;
		case 2:
			System.out.println("DOI");
			break;
		case 3:
			System.out.println("TREI");
			break;
		case 4:
			System.out.println("PATRU");
		default:
			System.out.println("INVALID");

		}
		scanner.close();

	}
}
