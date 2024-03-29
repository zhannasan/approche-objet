package essais;

import entites.*;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adA = new AdressePostale(84, "Maurice Bejart",34080, "Montpellier");
		AdressePostale adB = new AdressePostale(16,"St. Guillhem", 34000, "Montpellier");
				
		Personne persA = new Personne("Dupond","Caradoc", adA);
		Personne persB = new Personne("Dauphin","Gerard", adB);
		
		persA.afficherNoms();
		persB.afficherNoms();
				
		persB.setNewName("Laissac");
		persB.setNewSurame("Perceval");
		persB.afficherNoms();
		
		persB.setNewAdresse(new AdressePostale(18,"St. Guilhem", 34000, "Montpellier"));
		
		String name = persB.getName();
		
		String surname = persB.getSurame();
		
		AdressePostale address = persB.getAddress();
		
		System.out.println(name+" "+surname+" "+ address.afficherAddress());
		
	}

}
