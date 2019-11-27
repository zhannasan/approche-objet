package fr.diginamic.recensement;

import java.util.Comparator;

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
