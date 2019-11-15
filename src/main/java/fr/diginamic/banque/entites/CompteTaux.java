package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	double tauxRenum;

	public CompteTaux(int numeroCompte, double soldeCompte, Operation ope, double tauxRenum ) {
		super(numeroCompte, soldeCompte, ope);
		this.tauxRenum = tauxRenum;
	}
	
	public String toString(){
		return "---\r"+super.toString()+"\rTaux de renumeration "+tauxRenum+"\r---";
	}

	public double getTauxRenum() {
		return tauxRenum;
	}

	public void setTauxRenum(double tauxRenum) {
		this.tauxRenum = tauxRenum;
	}

}
