package fr.diginamic.recensement.difficile.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.difficile.entites.Recensement;
import fr.diginamic.recensement.difficile.entites.Ville;
import fr.diginamic.recensement.difficile.utils.CompareHabitant;
import fr.diginamic.recensement.difficile.utils.CompareStrings;

public class AffichageVillesPlusPeupleesRegion extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> villes = recensement.getVille();
		String region = scanner.nextLine();
		
		List<Ville> villesRegion=new ArrayList<Ville>();
		
		for (Ville v : villes) {
			if (v.getCodeDept().equals(region)) {
				villesRegion.add(v);
			}else if (CompareStrings.isSame(region,	v.getNomRegion())){ 
				villesRegion.add(v);
			}
		}
		
		Collections.sort(villesRegion, new CompareHabitant());
		
		if(villesRegion.size()!=0){
			System.out.println("\r10 villes les plus peuplees de "+region);
			for (int i=0; i<10;i++) {
				System.out.println(villesRegion.get(i).getNomCommune()+" : "+villesRegion.get(i).getPopulationTotale()+"\r");
			}
			System.out.println("\r");
		}else{
			System.out.println(region+" est inconnu\r");
		}
		
	}

}
