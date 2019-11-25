package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {		
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(24,0));
		maison.ajouterPiece(new Salon(30,0));
		maison.ajouterPiece(new Chambre(14,1));
		maison.ajouterPiece(new Chambre(16,1));
		maison.ajouterPiece(new Chambre(16,0));
		maison.ajouterPiece(new SalleDeBain(14,1));
		maison.ajouterPiece(new SalleDeBain(8,0));
		maison.ajouterPiece(new WC(4,0));
		maison.ajouterPiece(new WC(5,1));
		
		double superfTot = maison.getSuperficieTotale();
		System.out.println("Superficie totale de la maison "+superfTot);
		
		double superfChambre = maison.getSuperficieParTypePiece("Chambre");
		System.out.println("Superficie de toutes les chambres "+superfChambre);
		
		superfChambre = maison.getSuperficieParTypePiece("SalleDeBain");
		System.out.println("Superficie de toutes les salles de bain "+superfChambre);
		
		double superfEtage=maison.getSuperficieParEtage(0);
		System.out.println("Superficie du RDC "+ superfEtage);
		
		superfEtage=maison.getSuperficieParEtage(1);
		System.out.println("Superficie du premier étage "+ superfEtage);
		
		int nPieces = maison.getNbPieceParType("WC");
		int nSalon = maison.getNbPieceParType("Salon");
		System.out.println("Il y a "+nPieces+ " WC et "+nSalon+" salon");
	}

}
