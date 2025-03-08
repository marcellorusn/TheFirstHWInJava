/*Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17
sau cu 13 iar al doilea cu 19 sau cu 7.*/
public class p14 {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (i % 17 == 0 || i % 13 == 0) {
				int j = 1000 - i;
				if (j % 19 == 0 || j % 7 == 0) {
					System.out.println("(" + i + "  " + j + ")");
				}
			}
		}
	}
}
