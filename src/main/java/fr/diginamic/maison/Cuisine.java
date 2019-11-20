package fr.diginamic.maison;

public class Cuisine extends Piece{

	public Cuisine(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getPieceType() {
		return "Cuisine";
	}

}
