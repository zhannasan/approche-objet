package fr.diginamic.banque.entites;

public class Compte {
	private int numeroCompte;
	private double soldeInitial;
	//private double soldeCompte;
	private Operation[] tabOp;
	private Operation ope;
	double solde;
	
	void ajouterOperation(Operation[] tabOp){
		Operation[] ntabOp = new Operation [tabOp.length+1];
	}
	
	public Compte(int numeroCompte, double soldeInitial, Operation ope) {
		this.numeroCompte = numeroCompte;
		this.soldeInitial = soldeInitial;
		this.ope=ope;
	}

	
	public int getNumeroCompte() {
		return numeroCompte;
	}
	void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String toString(){
		return "Compte N "+ numeroCompte+"\rSolde initial "+soldeInitial+" nombre d'operations "+ope;
	}
	/*public String toString(){
		return "Compte N "+ numeroCompte+"\rSolde "+soldeCompte;
	}*/
	


		
}
