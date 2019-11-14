package fr.diginamic.banque.entites;

public abstract class Operation {
	private String date;
	private double montantOp;
	private String type;
	
	public Operation(String date, double montantOp) {
		this.date = date;
		this.montantOp = montantOp;
	}

	abstract String getType();

	public double getMontantOp() {
		return montantOp;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setMontantOp(double montantOp) {
		this.montantOp = montantOp;
	}
	public String toString(){
		return "Date "+ date+" Montant "+montantOp;
	}
}
