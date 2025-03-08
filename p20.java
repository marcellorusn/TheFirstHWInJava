/*Sa se determine daca un numar este palindrom sau nu (palindrom = care citit de la stânga
la dreapta sau de la dreapta la stânga rămâne neschimbat ex 4334).*/
import java.util.Scanner;
public class p20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introdu numarul: ");
		int n = scanner.nextInt();
		int k = 0;
		int neschimbat = n;
		  while (n > 0){
			  k = k*10+(n%10);
			  
			  n = n/10;
		  }
		  if (neschimbat == k) {
			  System.out.println("Da este polidrom: "+k);
		  }
		  else {
			  System.out.println("Nu este polidrom: "+k);
		  }
		  
	}

}