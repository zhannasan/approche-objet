package essais;

import entites.*;

public class TestPersonne {

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
		
		Personne persA = new Personne();
		persA.nom = "Dupont";
		persA.prenom = "Michel";
		persA.adresse = adA;
				
		Personne persB = new Personne();
		persB.nom = "Dauphin";
		persB.prenom = "Gerard";
		persB.adresse = adB;
	}

}
