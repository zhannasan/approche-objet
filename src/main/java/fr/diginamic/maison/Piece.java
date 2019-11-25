package fr.diginamic.maison;

public abstract class Piece {
	private double superficie;
	private int numEtage;
	
	public Piece(double superficie, int numEtage) {
		this.superficie = superficie;
		this.numEtage = numEtage;
	}

	public abstract String getPieceType();

	public double getSuperficiePiece() {
		return superficie;
	}
	
	public int getNumEtage() {
		return numEtage;
	}
}
