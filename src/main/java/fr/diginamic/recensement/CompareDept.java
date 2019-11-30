package fr.diginamic.recensement;

import java.util.Comparator;

public class CompareDept implements Comparator<Departement>{

	@Override
	public int compare(Departement d, Departement f) {
		if(d.getPopulationTotale()>f.getPopulationTotale()){
			return -1;
		}else if(d.getPopulationTotale()<f.getPopulationTotale()){
			return 1;
		}
		return 0;
	}



}
