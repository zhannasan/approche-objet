package fr.diginamic.recensement.difficile.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.difficile.entites.Recensement;
import fr.diginamic.recensement.difficile.entites.Ville;
import fr.diginamic.recensement.difficile.utils.CompareHabitant;

public class AffichageVillesPlusPeupleesDept extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> villes = recensement.getVille();
		String dept = scanner.nextLine();

		List<Ville> villesDept = new ArrayList<Ville>();
		for (Ville v : villes) {
			if (v.getCodeDept().equals(dept)) {
				villesDept.add(v);
			}
		}
		Collections.sort(villesDept, new CompareHabitant());
		if (villesDept.size() != 0) {
			System.out.println("\r10 villes les plus peuplees de " + dept);
			for (int i = 0; i < 10; i++) {
				System.out.println(villesDept.get(i).getNomCommune() + " : " + villesDept.get(i).getPopulationTotale());
			}
			System.out.println("\r");
		} else {
			System.out.println(dept + " est inconnu\r");
		}
	}

}
