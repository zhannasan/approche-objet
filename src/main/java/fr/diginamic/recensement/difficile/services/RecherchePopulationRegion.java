package fr.diginamic.recensement.difficile.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.difficile.entites.Recensement;
import fr.diginamic.recensement.difficile.entites.Ville;
import fr.diginamic.recensement.difficile.utils.CompareStrings;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> villes = recensement.getVille();
		String region = scanner.nextLine();

		int sum = 0;
		String nameR = null;
		for (Ville v : villes) {
			if (region.equals(v.getCodeRegion())) {
				sum+=v.getPopulationTotale();
				nameR=v.getNomRegion();
			} else if (CompareStrings.isSame(region,v.getNomRegion())) {
				sum+=v.getPopulationTotale();
				nameR=v.getNomRegion();
			}
		}
		if(sum==0){
			System.out.println(region+" est inconnu\r");
		}else{
			System.out.println("Population de " + nameR+ " : "	+ sum+"\r");
		}
	}

}
