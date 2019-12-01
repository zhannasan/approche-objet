package fr.diginamic.recensement.difficile.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.difficile.entites.Recensement;
import fr.diginamic.recensement.difficile.entites.Ville;

public class RecherchePopulationDept extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> villes = recensement.getVille();	
		String dept = scanner.nextLine();
		
		int sum = 0;
		for (Ville v : villes) {
				if(dept.equals(v.getCodeDept())){
					sum+=v.getPopulationTotale();
				}
		}
		if(sum==0){
			System.out.println(dept+" est inconnu\r");
		}else{
			System.out.println("Population de "+dept+" : "+sum+"\r");
		}
	}

}
