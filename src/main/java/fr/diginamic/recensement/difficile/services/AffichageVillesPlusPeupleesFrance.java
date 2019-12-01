package fr.diginamic.recensement.difficile.services;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.difficile.utils.CompareHabitant;
import fr.diginamic.recensement.difficile.entites.Recensement;
import fr.diginamic.recensement.difficile.entites.Ville;

public class AffichageVillesPlusPeupleesFrance extends MenuService{
	
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> ville = recensement.getVille();
		
		Collections.sort(ville, new CompareHabitant());
		System.out.println("\r10 villes les plus grandes  de France :");
		for (int i = 0; i < 10; i++) {
			System.out.println(ville.get(i).getNomCommune() + " : " + ville.get(i).getPopulationTotale());
		}
		System.out.println("\r");
	}
}
