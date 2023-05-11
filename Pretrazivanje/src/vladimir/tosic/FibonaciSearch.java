package vladimir.tosic;

/*
 * Fibonacijev niz je niz brojeva gde je svaki naredni broj u nizu jednak zbiru prethodna dva.
 * Da bi se sluzili ovom pretragom niz prvo mora biti sortiran rastuce.
 */

public class FibonaciSearch {

	public static int fibonacci(int niz[], int duzinaNiza, int broj) {

		int fibonacci2 = 0;
		int fibonacci1 = 1;
		int fibonacci = fibonacci1 + fibonacci2;

		// Trazi se najmanji broj koji je veci ili jednak duzini niza
		while (fibonacci < duzinaNiza) {

			fibonacci2 = fibonacci1;
			fibonacci1 = fibonacci;
			fibonacci = fibonacci2 + fibonacci1;
		}

		// offset sluzi da eliminise deo niza u kome se ne nalazi trazena vrednost
		int offset = -1;

		while (fibonacci > 1) {

			int i = Math.min(offset + fibonacci2, duzinaNiza - 1);

			// Poredjenje trazene vrednosti i vrednosti sa indeksa (i) iz niza
			if (niz[i] < broj) {
				fibonacci = fibonacci1;
				fibonacci1 = fibonacci2;
				fibonacci2 = fibonacci - fibonacci1;
				offset = i;
			} else if (niz[i] > broj) {
				fibonacci = fibonacci2;
				fibonacci1 = fibonacci1 - fibonacci2;
				fibonacci2 = fibonacci - fibonacci1;
			} else {
				// vracamo indeks elementa ukoliko je nadjen
				return i;
			}

		}
		// Poredjenje poslednjeg elementa sa brojem
		if (fibonacci1 == 1 && niz[offset + 1] == broj) {
			return offset + 1;
		}
		// Ako trazena vrednost nije unutar niza vraca se -1
		return -1;
	}

}
