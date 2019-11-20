package listes;

import java.util.*;

public class Ville {
	private String nom;
	private int nbHabit;
	
	public Ville(String nom, int nbHabit) {
		this.nom = nom;
		this.nbHabit = nbHabit;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabit() {
		return nbHabit;
	}

	public void setNbHabit(int nbHabit) {
		this.nbHabit = nbHabit;
	}

	
	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		int max = 0;
		int maxInd = 0;
		int minInd = 0;
		int min=0;
		if(villes.get(0).nbHabit<=villes.get(1).nbHabit){
			min = villes.get(0).nbHabit;
			max =  villes.get(1).nbHabit;
		}else{
			min = villes.get(1).nbHabit;
			max =  villes.get(0).nbHabit;
		}
		
		for(int i=0; i<villes.size(); i++){
			if(villes.get(i).nbHabit>=max){
				max=villes.get(i).nbHabit;
				maxInd = i;
			}else if(villes.get(i).nbHabit<= min){
				min=villes.get(i).nbHabit;
				minInd = i;
				}
		}
		System.out.println(villes.get(maxInd).nom+" "+villes.get(maxInd).nbHabit);
		System.out.println(villes.get(minInd).nom+" "+villes.get(minInd).nbHabit);
		
		villes.remove(minInd);
		
		for(int i=0; i<villes.size(); i++){
			System.out.println(villes.get(i).nom);
		}
		
		for(int i=0; i<villes.size(); i++){
			if(villes.get(i).nbHabit>=100000){
				String ville = villes.get(i).nom.toUpperCase();
				villes.get(i).setNom(ville);
			}
		}
		for(int i=0; i<villes.size(); i++){
			System.out.println(villes.get(i).nom);
		}
				
	}

}
