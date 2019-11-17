package fr.diginamic.entites;

public class Cercle {
	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre(double rayon){
		return 2*Math.PI*rayon;
	}
	
	public double surface(double rayon){
		return Math.PI*rayon*rayon;
	}
	
	public String toString(){
		return "Perimetre "+perimetre(rayon)+" surface " +surface(rayon);
	}
}
