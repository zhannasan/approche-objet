package fr.diginamic.recensement.difficile.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.difficile.entites.Ville;
import fr.diginamic.recensement.difficile.utils.CompareStrings;
import fr.diginamic.recensement.difficile.entites.Recensement;

public class RecherchePopulationVille extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> villes = recensement.getVille();
		String ville = scanner.nextLine();
		
		String villeName = null;
		for (Ville v : villes) {
			if (CompareStrings.isSame(ville, v.getNomCommune())){
				villeName = v.getNomCommune();
				System.out.println("Population de "+villeName+" : "+v.getPopulationTotale()+"\r");
			}
		}
		
		if(villeName==null){
			System.out.println(ville+" est inconnue\r");
		}
		
	}

}
