package fr.diginamic.recensement.difficile.utils;

import java.util.Comparator;

import fr.diginamic.recensement.difficile.entites.Ville;

public class CompareHabitant implements Comparator<Ville>{

	@Override
	public int compare(Ville v, Ville p) {
		if(v.getPopulationTotale()>p.getPopulationTotale()){
			return -1;
		}else if(v.getPopulationTotale()<p.getPopulationTotale()){
			return 1;
		}
		return 0;
	}
}
