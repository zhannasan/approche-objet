package fr.diginamic.banque.entites;

public class Compte {
	private int numeroCompte;
	private double soldeInitial;
	private double soldeCompte;
	private Operation[] tabOp;
	private Operation ope;
	double solde;
	
	void ajouterOperation(Operation ope){
		this.ope=ope;
	}
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

/*	public double getSolde(String type) {
		if (type=="CREDIT"){
			solde = soldeInitial+ope;
		}
		else if(type=="DEBIT"){
			solde = soldeInitial-ope;
	}
		return solde;
	}
		
	public String toString(){
		return "Compte N "+ numeroCompte+"\rSolde "+soldeCompte;
	}*/
	


		
}
