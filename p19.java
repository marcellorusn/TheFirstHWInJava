//Sa se afiseze inversul unui numar dat (124 -> 421).
import java.util.Scanner;
public class p19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introdu numarul: ");
		int n = scanner.nextInt();
		int k = 0;
		  while (n > 0){
			  k = k*10+(n%10);
			  
			  n = n/10;
		  }
		  System.out.println("Oglindit: "+k);
	}

}
