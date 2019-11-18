package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	int joursMois;
	double montantJour;
	
	public Pigiste(String nom, String prenom, int joursMois, double montantJour) {
		super(nom, prenom);
		this.joursMois = joursMois;
		this.montantJour = montantJour;
	}
	@Override
	public double getSalaire() {
		double salaire=joursMois*montantJour;
		return salaire;
	}
	@Override
	String getStatus() {
		return "Pigiste";
	}
}
