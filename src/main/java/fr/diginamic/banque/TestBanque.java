package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;


public class TestBanque {

	public static void main(String[] args) {
		String[] comptes = new String[2] ; 
		
		Compte monCompte = new Compte(137234566, 3244.22);
		CompteTaux monCompteT = new CompteTaux(234132136, 43344.3, 0.05);
		/*System.out.println("Compte N "+monCompte.getNumeroCompte());
		System.out.println("Solde "+monCompte.getSoldeCompte());
		
		System.out.println(monCompte.toString());*/
		
		
		comptes[0]=monCompte.toString();
		comptes[1]=monCompteT.toString();
		
		for (int i=0; i < comptes.length; i++){
			System.out.println(comptes[i]);
		}
	}

}
