package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int numEtage) {
		super(superficie, numEtage);
		
	}

	@Override
	String getPieceType() {
		return "SdB";
	}

}
