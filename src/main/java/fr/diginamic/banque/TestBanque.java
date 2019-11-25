package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestBanque {
	
	public static void main(String[] args) {
		/*String[] comptes = new String[2] ; 
		
		Compte monCompte = new Compte(137234566, 3244.22);
		CompteTaux monCompteT = new CompteTaux(234132136, 43344.3, 0.05);
		System.out.println("Compte N "+monCompte.getNumeroCompte());
		System.out.println("Solde "+monCompte.getSoldeCompte());
		
		System.out.println(monCompte.toString());
				
		comptes[0]=monCompte.toString();
		comptes[1]=monCompteT.toString();
		
		Compte[] comptes=new Compte[2];
		comptes[0]=new Compte(137234566, 3244.22);
		comptes[1]=new CompteTaux(234132136, 43344.3, 0.05);
		
		for (int i=0; i < comptes.length; i++){
			System.out.println(comptes[i]);
		}
		
		Compte compte1 = new Compte(234234, 123.);
		Compte compte2 = new Compte(234234, 123.);
		Compte compte3 = compte2;
		
		System.out.println(compte1.equals(compte2));
		System.out.println(compte3.equals(compte2));
		*/
		
		Compte compte = new Compte(234234, 123.);
		compte.ajouterOperation(new Debit("24/08/2019",231.8));
		compte.ajouterOperation(new Credit("07/09/2019",400.0));
		compte.ajouterOperation(new Debit("16/10/2019",1134.0));
		compte.ajouterOperation(new Credit("17/10/2019",205.0));
		
		System.out.println("Compte N"+compte.getNumeroCompte());
		System.out.println("Solde "+compte.getSolde()+"\u20ac");
		System.out.println("Debit "+compte.getSolde("DEBIT")+"\u20ac");
		System.out.println("Credit "+compte.getSolde("CREDIT")+"\u20ac");
		System.out.println(compte.toString());

		
		
	}

}
