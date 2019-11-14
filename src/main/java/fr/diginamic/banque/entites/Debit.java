package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, double montantOp) {
		super(date, montantOp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "DEBIT";
	}

}
