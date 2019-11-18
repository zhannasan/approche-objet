package fr.diginamic.salaire;

public abstract class Intervenant {
	String nom;
	String prenom;
	double salaire;
	String status;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;	
	}
	
	public abstract double getSalaire();
	abstract String getStatus();
	
	public void afficherDonnees(){
		System.out.println(nom+" "+prenom+" "+getSalaire()+" "+getStatus());
	}
}
