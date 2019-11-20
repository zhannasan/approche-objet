package sets;

import java.util.*;

public class Pays {
	private String nom;
	private int nHabit;
	private double pib;

	public Pays(String nom, int nHabit, double pib){
		 this.nom=nom;
		 this.nHabit=nHabit;
		 this.pib=pib;
	};
	public void add(String nom, int nHabit, double pib){};
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getnHabit() {
		return nHabit;
	}

	public void setnHabit(int nHabit) {
		this.nHabit = nHabit;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}

	public static void main(String[] args) {
		Set <Pays> setPays = new HashSet<Pays>();
		setPays.add(new Pays ("USA", 329064917, 59939));
		setPays.add(new Pays ("France", 65129728, 39827));
		setPays.add(new Pays ("Allemagne", 83517045,44680));
		setPays.add(new Pays ("UK", 67530172, 39532));
		setPays.add(new Pays ("Italie",60550075, 32038));
		setPays.add(new Pays ("Japon", 126860301, 38214));
		setPays.add(new Pays ("Chine", 1433783686,  8612));
		setPays.add(new Pays ("Russie",145872256,  10846));
		setPays.add(new Pays ("Inde", 1366417754, 1980));
		
		System.out.println((setPays. );
		
		
		
		
	}

}
