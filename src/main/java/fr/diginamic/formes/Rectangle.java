package fr.diginamic.formes;

public class Rectangle extends Formes {
	double longueur;
	double largeur;
	@Override
	public double calculerSurface() {
		double surface=longueur*largeur;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre = 2*(longueur+largeur);
		return perimetre;
		}

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

}
