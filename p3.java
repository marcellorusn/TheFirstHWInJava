import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		System.out.print("Introdu  numerele: ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		if (n%2==0 && k%2==0){
			System.out.print((k + n)/2);
			
		}
		
	    else if (n%2==1 && k%2==1){
			System.out.print((k * n));
		}
	    else {
	    	System.out.print((k + n));
	    }
		
		scanner.close();
		
		
	}
}
