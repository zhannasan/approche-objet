package fr.diginamic.salaire;

public class Salaire extends Intervenant{
	double salaireMensuel;
	
	public Salaire(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}

	@Override
	String getStatus() {
		return "Salarie";
	}

}
