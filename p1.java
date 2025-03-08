import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		System.out.print("Introdu un număr: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n > 5 && n < 10) {
			System.out.print("Admis");
		} 
		else if (n > 10 || n < 0) {
			System.out.print("Invalid");
		} 
		else {
			System.out.print("Respins");
		}
		
		scanner.close();

	}

}
