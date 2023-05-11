package vladimir.tosic;

/*
 * Linear search se koristi za pretragu vrednosti nekog niza
 *  i funkcionise tako što koristeći neku petlju prolazimo kroz niz elemenata.
 *  Kada dodjemo do elementa koji sadrži traženu vrednost, vraća se indeks elementa.
 */

public class LinearSearch {

	public static int nadjiElement(int niz[], int duzinaNiza, int vrednost) {

		for (int i = 0; i < duzinaNiza; i++) {
			if (niz[i] == vrednost)
				return i;
		}
		return -1;
	}

}
