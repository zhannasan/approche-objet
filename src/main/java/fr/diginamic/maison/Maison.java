package fr.diginamic.maison;

public class Maison {
	private Piece[] tab = new Piece[0];

	public Maison() {
		super();
	}

	public void ajouterPiece(Piece p){
		Piece[] newtab = new Piece[tab.length+1];
		for (int i=0; i<tab.length; i++){
			newtab[i]= tab[i];
		}
		newtab[newtab.length-1] = p;
		tab=newtab;
	};	
	
	public double getSuperficieTotale(){
		double supMaison = 0;
		for (int i=0;i<tab.length;i++){
			supMaison += tab[i].getSuperficiePiece();
		}
		return supMaison;
	};

	public double getSuperficieParEtage(int etage){
		double supParEtage = 0;
		for (int i=0;i<tab.length;i++){
			if(tab[i].getNumEtage()==etage){
			supParEtage += tab[i].getSuperficiePiece();
			}
		}
		return supParEtage;
	}
	
	public double getSuperficieParTypePiece(String type){
		double supParType = 0;
		for (int i=0;i<tab.length;i++){
			if(tab[i].getPieceType().equals(type)){
				supParType += tab[i].getSuperficiePiece();
			}
		}
		return supParType;
	};
	public int getNbPieceParType(String type){
		int nbPiece = 0;
		for (int i=0;i<tab.length;i++){
			if(tab[i].getPieceType().equals(type)){
				nbPiece += 1;
			}
		}
		return nbPiece;
	}
}
