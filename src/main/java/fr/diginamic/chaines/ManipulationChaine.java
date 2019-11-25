package fr.diginamic.chaines;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Length: " + chaine.length());
		System.out.println("IndexOf: " + chaine.indexOf(";"));
		System.out.println("Substring: " + chaine.substring(7,14));
		
		System.out.println("Nom: " + chaine.substring(0,chaine.indexOf(";")));
		System.out.println("Nom: " + chaine.substring(0,chaine.indexOf(";")).toUpperCase());
		System.out.println("Nom: " + chaine.substring(0,chaine.indexOf(";")).toLowerCase());
		
		String[] tab = chaine.split(";");
		for(int i=0; i<tab.length; i++){
			System.out.println(tab[i]);
		}
		
		Personne person = new Personne(tab[0],tab[1]);
		Compte account = new Compte(Integer.parseInt(tab[2]), Double.valueOf(tab[3].replace(" ","")));
		person.afficherNoms();
		account.afficherLeCompte();
		
	}

}
