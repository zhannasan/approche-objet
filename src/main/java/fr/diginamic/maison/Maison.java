package fr.diginamic.maison;

public abstract class Maison {
	Piece[] tab;
	double superficie;
	
	public Piece[] ajouterPiece(Piece[] tab, Piece p){
		Piece[] newtab = new Piece[tab.length+1];
		for (int i=0; i<tab.length; i++){
			newtab[i]= tab[i];
		}
		newtab[tab.length]=p;
		return newtab;
	};
	
	public double getSuperficieMaison(){
		double supMaison = 0;
		for (int i=0;i<tab.length;i++){
			supMaison += tab[i].getSuperficiePiece();
		}
		return supMaison;
	};
	
	public double getSuperficiePiece(){
		return superficie;
	};
	public double getNbPiece(){
		return superficie;
	};
}
