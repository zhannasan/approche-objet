package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	double tauxRenum;

	public CompteTaux(int numeroCompte, double soldeCompte, double tauxRenum ) {
		super(numeroCompte, soldeCompte);
		this.tauxRenum = tauxRenum;
	}
	
	public String toString(){
		return super.toString()+" Taux de renumeration "+tauxRenum+"%";
	}

	public double getTauxRenum() {
		return tauxRenum;
	}

	public void setTauxRenum(double tauxRenum) {
		this.tauxRenum = tauxRenum;
	}

}
