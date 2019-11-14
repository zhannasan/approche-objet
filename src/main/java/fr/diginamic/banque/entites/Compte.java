package fr.diginamic.banque.entites;

public class Compte {
	private int numeroCompte;
	private double soldeCompte;
	
	public Compte(int numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}
	void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSoldeCompte() {
		return soldeCompte;
	}
	void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	
		
}
