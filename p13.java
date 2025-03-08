//Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17
//iar al doilea cu 19.
public class p13 {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (i % 17 == 0) {
				for (int j = 0; j <= 1000; j++) {
					if (j % 19 == 0 && j + i == 1000) {
						System.out.println("(" + i + ", " + j + ")");
					}
				}
			}
		}

	}

}
