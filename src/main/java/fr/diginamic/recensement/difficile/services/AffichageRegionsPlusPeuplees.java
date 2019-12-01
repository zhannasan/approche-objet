package fr.diginamic.recensement.difficile.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.difficile.entites.*;
import fr.diginamic.recensement.difficile.utils.CompareRegion;

public class AffichageRegionsPlusPeuplees extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> villes = recensement.getVille();
		HashMap<String, Region> mapRegion = new HashMap<>();
		
		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			String codeRegion = v.getCodeRegion();
			Region region = mapRegion.get(codeRegion);

			if (region == null) {
				region = new Region(v.getCodeRegion(), v.getNomRegion());
				mapRegion.put(v.getCodeRegion(), region);
			}
			region.setPopulationTotale(region.getPopulationTotale() + v.getPopulationTotale());
		}
		
		System.out.println("\r10 Regions les plus grandes de France  :");
		List<Region> regions = new ArrayList<>(mapRegion.values());
		
		Collections.sort(regions, new CompareRegion());
		for (int i = 0; i < 10; i++) {
			System.out.println("Region : " + regions.get(i).getCodeRegion() + " " + regions.get(i).getNomRegion()
					+ ", population : " + regions.get(i).getPopulationTotale());
		}
		System.out.println("\r");
	}
}
