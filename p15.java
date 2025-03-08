//Sa se genereze toate numerele de 4 cifre de forma 3a2b care se divid cu 9.
public class p15 {
	public static void main(String[] args) {
		for (int i = 3020; i <= 3929; i++) {
			if (i % 9 == 0) {
				
				System.out.println("(" + i + ")");
			}

		}
	}

}
