package fr.diginamic.recensement.difficile.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.difficile.entites.*;
import fr.diginamic.recensement.difficile.utils.CompareDept;

public class AffichageDeptsPlusPeuples extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> villes = recensement.getVille();
		
		HashMap<String, Departement> mapDept = new HashMap<>();

		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			String codeDept = v.getCodeDept();
			Departement dept = mapDept.get(codeDept);

			if (dept == null) {
				dept = new Departement(v.getCodeDept());
				mapDept.put(v.getCodeDept(), dept);
			}
			dept.setPopulationTotale(dept.getPopulationTotale() + v.getPopulationTotale());

		}
		
		List<Departement> departements = new ArrayList<>(mapDept.values());
		Collections.sort(departements, new CompareDept());
		
		System.out.println("\r10 Departements les plus grandes de France  :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Departement : " + departements.get(i).getCodeDept() + ", population : "
					+ departements.get(i).getPopulationTotale());
		}
		System.out.println("\r");
	}
}
