package fr.diginamic.maison;

public abstract class Piece {
	double superficie;
	int numEtage;
	
	public Piece(double superficie, int numEtage) {
		this.superficie = superficie;
		this.numEtage = numEtage;
	}

	public double getSuperficiePiece() {
		return superficie;
	}
	
	abstract String getPieceType();
	
}
