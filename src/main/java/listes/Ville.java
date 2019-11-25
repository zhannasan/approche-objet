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
	
	static class Pair{
		int max;
		int min;
	}
	
	static Pair getMinMax(List<Ville> list) { 
		Pair minmaxInd = new Pair();
		int max = 0;
		int min=0;
		if(list.get(0).nbHabit<=list.get(1).nbHabit){
			min = list.get(0).nbHabit;
			max =  list.get(1).nbHabit;
		}else{
			min = list.get(1).nbHabit;
			max =  list.get(0).nbHabit;
		}
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i).nbHabit>=max){
				max=list.get(i).nbHabit;
				minmaxInd.max = i;
			}else if(list.get(i).nbHabit<= min){
				min=list.get(i).nbHabit;
				minmaxInd.min = i;
				}
		}
		return minmaxInd;
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
		
		Pair minmaxInd = getMinMax(villes);
				
		System.out.println("Max "+villes.get(minmaxInd.max).nom+" "+villes.get(minmaxInd.max).nbHabit);
		System.out.println("Min "+villes.get(minmaxInd.min).nom+" "+villes.get(minmaxInd.min).nbHabit);
		
		villes.remove(minmaxInd.min);
		
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
