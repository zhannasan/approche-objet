package fr.diginamic.banque;

import java.util.List;
import java.util.Scanner;
import fr.diginamic.banque.entites.*;

public class ApplicationDao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CompteDao dao = new CompteDaoMem();
		int input = 0;
		
		do{
			afficherMenu();
			
				String inputS = sc.nextLine();
				input = Integer.valueOf(inputS);
				switch(input){
				
				case 1:
					System.out.println("Liste des comptes");
					List<Compte> comptes = dao.lister();
					if(comptes.size()>=1){
						for(Compte c : comptes){
							System.out.println(c.toString());
						}
					}
					break;
				case 2:
					System.out.println("Ajout d’un nouveau compte");
					System.out.println("Veuillez saisir le numéro :");
					int numeroCompte = Integer.valueOf(sc.nextLine());
					
					System.out.println("Veuillez saisir le solde initial:");
					double soldeInitial = Double.valueOf(sc.nextLine());
					
					System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
					int type = Integer.valueOf(sc.nextLine());
					
					if(type==1){
						Compte compte = new Compte(numeroCompte, soldeInitial);
						dao.sauvegarder(compte);
					}
					else if(type==2){
						System.out.println("Veuillez saisir le taux :");
						double taux =  Double.valueOf(sc.nextLine());
						CompteTaux compteT = new CompteTaux(numeroCompte, soldeInitial, taux); 
						dao.sauvegarder(compteT);
					}else{
						System.out.println("Le type de compte inconnu");
					}
					break;
				case 3:
					System.out.println("Ajout d’une opération à un compte");
					comptes = dao.lister();
					for(Compte c : comptes){
						System.out.println(c);
					}
					System.out.println("Veuillez choisir le numéro de compte concerné :");
					int numero = Integer.valueOf(sc.nextLine());
					Compte compte = dao.getCompte(numero);
					if (dao.existe(numero)){ 
						dao.getCompte(numero);
					}else{
						System.out.println("Numero de compte inconnu");
						break;
					}
					System.out.println("Veuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT):");
					int typeCD = Integer.valueOf(sc.nextLine());
					if (typeCD!=1&&typeCD!=2){
						System.out.println("Opération inconnue");
						break;
					}
					System.out.println("Veuillez saisir la date :");
					String date = sc.nextLine();
					
					System.out.println("Veuillez saisir le montant :");
					double montant =  Double.valueOf(sc.nextLine());
					if(typeCD ==1){
						compte.ajouterOperation(new Credit(date,montant));
					}else if(typeCD ==2){
						compte.ajouterOperation(new Debit(date,montant));
					}
					else{
						System.out.println("Le type d’opération inconnu");
					}
					break;
				case 4:
					System.out.println("Suppression d’un compte");
					comptes = dao.lister();
					for(Compte c : comptes){
						System.out.println(c);
					}
					System.out.println("Veuillez saisir le numéro de compte à supprimer :");
					numero = Integer.valueOf(sc.nextLine());
					compte = dao.getCompte(numero);
					if (dao.existe(numero)){ 
						dao.getCompte(numero);
						dao.supprimer(numero);
						if(!dao.existe(numero)){
							System.out.println("Compte N "+numero+" a été supprimé");
						}
					}else{
						System.out.println("Numero de compte inconnu");
						break;
					}
					break;
				case 99:
					System.out.println("Aurevoir! \u2639");
					break;
				default:
					System.out.println("Saisie inconnue. Veuillez recommencer.");
					break;
				}
		}
			while(input!=99);

	}
	
	public static void afficherMenu(){
		System.out.println("***** Administration des comptes *****");
		System.out.println("1. Lister les comptes");
		System.out.println("2. Ajouter un nouveau compte");
		System.out.println("3. Ajouter une opération à un compte");
		System.out.println("4. Supprimer un compte");
		System.out.println("99. Sortir");
	}

}
