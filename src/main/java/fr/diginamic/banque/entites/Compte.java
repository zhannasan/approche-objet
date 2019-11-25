package fr.diginamic.banque.entites;

public class Compte {
	private int numeroCompte;
	private double soldeInitial;
	private double soldeCompte;
	private Operation[] operations= new Operation[0];
	double solde;
	
	/*public Compte(int numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}*/
	public Compte(int numeroCompte, double soldeInitial) {
		this.numeroCompte = numeroCompte;
		this.soldeInitial = soldeInitial;
	}
	
	public void ajouterOperation(Operation ope){
		Operation[] nOperation = new Operation [operations.length+1];
		for (int i=0; i<operations.length; i++){
			nOperation[i]= operations[i];
		}
		nOperation[operations.length]=ope;
		operations = nOperation;
	}
	
	public double getSolde() {
		double sum = 0.0;
		for (int i=0; i<operations.length; i++){
			if(operations[i].getType().equals("DEBIT")){
				sum += operations[i].getMontantOp();
			}else if(operations[i].getType().equals("CREDIT")){
				sum -= operations[i].getMontantOp();
			}
		}
		double soldeT=soldeInitial+sum;
		return soldeT;
	}
	
	public double getSolde(String type) {
		double solde = 0.0;
		for (int i=0; i<operations.length; i++){
			if(operations[i].getType().equals(type) && type!=null){
				solde += operations[i].getMontantOp();
			}
		}
		return solde;
	}
	
	public double getSoldeCompte() {
		return soldeCompte;
	}
	
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public boolean equals(Object obj){
		if(! (obj instanceof Compte)){
			return false;
		}
		Compte compteN=(Compte)obj;
		return (this.numeroCompte==compteN.getNumeroCompte()&& this.soldeCompte==compteN.getSoldeCompte());
		
	}
	
	public int getNumeroCompte() {
		return numeroCompte;
	}
	void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String toString(){
		return "Compte N "+ numeroCompte+" Solde initial "+soldeInitial+"\u20ac. Solde "+getSolde()+"\u20ac. Nombre d'operations "+operations.length;
	}
	/*public String toString(){
		return "Compte N "+ numeroCompte+"\rSolde "+soldeCompte+"\u20ac";
	}*/
	public void afficherLeCompte(){
		System.out.println("Compte N "+ numeroCompte+"\rSolde "+soldeCompte+"\u20ac");
	}


		
}
