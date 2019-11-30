package fr.diginamic.recensement;

import java.util.Comparator;

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
