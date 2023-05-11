package vladimir.tosic;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int niz[] = { 3, 2, 5, 7, 9, 0, 12, 15, 66 };

		int vrednost = 12;
		
		// linear search
		int indeksElementa = LinearSearch.nadjiElement(niz, niz.length, vrednost);

		if (indeksElementa == -1) {
			System.out.println("Trazeni element se ne nalazi unutar niza.");
		} else {
			System.out.println("Indeks trazenog elementa je: " + indeksElementa);
		}

		// binary search

		Arrays.sort(niz);

		indeksElementa = BinarySearch.binarySearch(niz, vrednost);

		if (indeksElementa == -1) {
			System.out.println("Trazeni element se ne nalazi unutar niza.");
		} else {
			System.out.println("Indeks trazenog elementa je: " + indeksElementa);
		}
		
		
		// fibonacci search
		indeksElementa = FibonaciSearch.fibonacci(niz, niz.length, vrednost);
		
		if (indeksElementa == -1) {
			System.out.println("Trazeni element se ne nalazi unutar niza.");
		} else {
			System.out.println("Indeks trazenog elementa je: " + indeksElementa);
		}
		
	}

}
