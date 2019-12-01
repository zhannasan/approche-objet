package fr.diginamic.recensement.difficile;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import fr.diginamic.recensement.difficile.entites.Recensement;
import fr.diginamic.recensement.difficile.services.*;
import fr.diginamic.recensement.difficile.utils.ReadCsvFile;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Recensement recensement = ReadCsvFile.read(
				"C:/Users/jsant/Documents/Docs/Formations/Diginamic/Materials/JAVA/OOPJ5/recensement population 2016.csv");
		if(recensement==null){
			System.exit(0);
		}
		int input = 0;
		do {
			afficherMenu();
			String inputS = scanner.nextLine();

			if (StringUtils.isNumeric(inputS)) {
				input = Integer.valueOf(inputS);
				switch (input) {
				case 1:
					// Population d’une ville donnée
					RecherchePopulationVille rechercheVille = new RecherchePopulationVille();
					rechercheVille.traiter(recensement, scanner);
					break;
				case 2:
					// Population d’un département donné
					RecherchePopulationDept rechercheDept = new RecherchePopulationDept();
					rechercheDept.traiter(recensement, scanner);
					break;
				case 3:
					// Population d’une région donnée
					RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion();
					rechercheRegion.traiter(recensement, scanner);
					break;
				case 4:
					// Afficher les 10 régions les plus peuplées
					AffichageRegionsPlusPeuplees afficherRegion = new AffichageRegionsPlusPeuplees();
					afficherRegion.traiter(recensement, scanner);
					break;
				case 5:
					// Afficher les 10 départements les plus peuplés
					AffichageDeptsPlusPeuples afficherDept = new AffichageDeptsPlusPeuples();
					afficherDept.traiter(recensement, scanner);
					break;
				case 6:
					// Afficher les 10 villes les plus peuplées d’un département
					AffichageVillesPlusPeupleesDept afficherVilleDept = new AffichageVillesPlusPeupleesDept();
					afficherVilleDept.traiter(recensement, scanner);
					break;
				case 7:
					// Afficher les 10 villes les plus peuplées d’une région
					AffichageVillesPlusPeupleesRegion afficherVilleRegion = new AffichageVillesPlusPeupleesRegion();
					afficherVilleRegion.traiter(recensement, scanner);
					break;
				case 8:
					// Afficher les 10 villes les plus peuplées de France
					AffichageVillesPlusPeupleesFrance afficherVilleFr = new AffichageVillesPlusPeupleesFrance();
					afficherVilleFr.traiter(recensement, scanner);
					break;
				case 9:
					System.out.println("Au revoir !");
					break;
				default:
					break;
				}
			} else {
				System.out.println("Veuillez saisir un nombre\r");
			}
		} while (input != 9);
		{
			scanner.close();
		}
	}

	public static void afficherMenu() {
		System.out.println("1. Population d’une ville donnée");
		System.out.println("2. Population d’un département donné (numéro)");
		System.out.println("3. Population d’une région donnée (nom ou numéro)");
		System.out.println("4. Afficher les 10 régions les plus peuplées");
		System.out.println("5. Afficher les 10 départements les plus peuplés");
		System.out.println("6. Afficher les 10 villes les plus peuplées d’un département (numéro)");
		System.out.println("7. Afficher les 10 villes les plus peuplées d’une région (nom ou numéro)");
		System.out.println("8. Afficher les 10 villes les plus peuplées de France");
		System.out.println("9. Sortir");
	}

}
