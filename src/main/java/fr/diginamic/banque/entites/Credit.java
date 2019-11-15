package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, double montantOp) {
		super(date, montantOp);
	}

	@Override
	public String getType() {
		return "CREDIT";
	}

}
