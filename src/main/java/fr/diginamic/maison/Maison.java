package fr.diginamic.maison;

/**
 * @author janka
 *
 */
public class Maison {
	private Piece[] tab = new Piece[0];

	public Maison() {
		super();
	}

	/**
	 * @param p parameter of Class Piece (area, floor number), 
	 * where the floor number is allowed to be negative for basement
	 */
	public void ajouterPiece(Piece p){
		try{
			if (p.getSuperficiePiece()>=0){
				Piece[] newtab = new Piece[tab.length+1];
				for (int i=0; i<tab.length; i++){
					newtab[i]= tab[i];
				}
				newtab[newtab.length-1] = p;
				tab=newtab;
			}
			}catch(NullPointerException npe){
				System.out.println("Cannot pass null argument to Piece");}
			
	};	
	
	public double getSuperficieTotale(){
		double supMaison = 0;
		try{
		for (int i=0;i<tab.length;i++){
			supMaison += tab[i].getSuperficiePiece();
		}
		return supMaison;}catch(NullPointerException npe){
			System.out.println("Cannot pass null argument to Piece "+npe.getMessage());}
		return 0;
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
