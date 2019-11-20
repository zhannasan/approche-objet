package fr.diginamic.maison;

public class Salon extends Piece{

	public Salon(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getPieceType() {
		return "Salon";
	}

}
