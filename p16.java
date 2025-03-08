//Sa se afiseze separat cifrele unui numar.
import java.util.Scanner;
public class p16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		for(int i = 0; i<= n; i++) {
			System.out.println("("+n+")");
		}
		scanner.close();
		
	}

}
