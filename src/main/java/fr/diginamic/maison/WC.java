package fr.diginamic.maison;

public class WC extends Piece{

	public WC(double superficie, int numEtage) {
		super(superficie, numEtage);
	}

	@Override
	String getPieceType() {
		return "WC";
	}

}
