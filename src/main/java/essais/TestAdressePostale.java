package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adA = new AdressePostale();
		adA.numeroRue = 84;
		adA.nomRue = "Maurice Bejart";
		adA.codePostal = 34080;
		adA.ville = "Montpellier";

		AdressePostale adB = new AdressePostale();
		adB.numeroRue = 16;
		adB.nomRue = "St. Guillhem";
		adB.codePostal = 34000;
		adB.ville = "Montpellier";
	}
	

}
