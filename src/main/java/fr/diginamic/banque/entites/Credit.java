package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, double montantOp) {
		super(date, montantOp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "CREDIT";
	}

}
