package vladimir.tosic;

public class BinarySearch {

	/*
	 * Za korišćenje binarne pretrage pre svega niz mora biti rastuće. Pretraga
	 * funkcioniše tako što se početni niz deli na dva podniza. Zatim se poredi
	 * vrednost traženog elementa i vrednost elementa čija je pozicija na polovini
	 * niza i ukoliko traženi element ima veću vrednost formira se novi niz koji
	 * sada ima opseg od sredjeg indeksa pa do poslednjeg indeksa prethodnog niza
	 * (desna strana primarnog niza). U suprotnom se formira niz sa opsegom od
	 * početnog indeksa do srednjeg indeksa primarnog niza (leva strana primarnog
	 * niza). Zatim se novi niz nakon sledeće iteracije ponovo skraćuje za pola i
	 * tako u krug dok se ne dođe do indeksa traženog elementa.
	 */

	public static int binarySearch(int niz[], int broj) {

		int prviIndeks = 0;
		int poslednjiIndeks = niz.length - 1;

		while (prviIndeks <= poslednjiIndeks) {

			int sredinaNiza = prviIndeks + (poslednjiIndeks - prviIndeks) / 2;

			int vrednost = niz[sredinaNiza];
			
			if (vrednost < broj) 
				prviIndeks = sredinaNiza + 1;
			 else if (vrednost > broj) 
				poslednjiIndeks = sredinaNiza - 1;
			 else 
				return sredinaNiza;
			
		}
		// Ukoliko u nizu ne postoji tražena vrednost, funkcija vraća -1
		return -1;
	}

}
