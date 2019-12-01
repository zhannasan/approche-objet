package fr.diginamic.recensement.difficile.utils;

import java.util.Comparator;

import fr.diginamic.recensement.difficile.entites.Region;

public class CompareRegion implements Comparator<Region>{

	@Override
	public int compare(Region r, Region p) {
		if(r.getPopulationTotale()>p.getPopulationTotale()){
			return -1;
		}else if(r.getPopulationTotale()<p.getPopulationTotale()){
			return 1;
		}
		return 0;
	}
	

}
