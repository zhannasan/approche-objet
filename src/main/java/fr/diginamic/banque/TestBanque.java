package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte monCompte = new Compte(137234566, 3244.22);
		System.out.println("Compte N "+monCompte.getNumeroCompte());
		System.out.println("Solde "+monCompte.getSoldeCompte());
		
		System.out.println(monCompte.toString());
	}

}
