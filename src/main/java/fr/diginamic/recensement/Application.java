package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) {

		try {
			List<Ville> ville = new ArrayList<Ville>();
			File file = new File(
					"C:/Users/jsant/Documents/Docs/Formations/Diginamic/Materials/JAVA/OOPJ5/recensement population 2016.csv");
			List<String> lines = FileUtils.readLines(file, "UTF-8");
			int populationTotale = 0;
			for (String line : lines) {
				// System.out.println(line);
				String[] columns = line.split(";");
				String codeRegion = columns[0];
				String nomRegion = columns[1];
				String codeDept = columns[2];
				String codeCommune = columns[4];
				String nomCommune = columns[5];
				String population = columns[6];
				String pop = population.trim().replaceAll(" ", "");
				try {
					populationTotale = Integer.parseInt(pop);
				} catch (NumberFormatException nfe) {
					System.out.println(nfe.getStackTrace());
				}
				Ville v = new Ville(codeRegion, nomRegion, codeDept, codeCommune, nomCommune, populationTotale);
				ville.add(v);
			}
			ville.remove(0);
			System.out.println("\r");

			// -----Montpellier
			for (Ville v : ville) {
				if (v.getNomCommune().equals("Montpellier")) {
					System.out.println(v.toString());
				}
			}

			// -----l'Herault
			int sum = 0;
			List<Ville> herault = new ArrayList<Ville>();
			for (Ville v : ville) {
				if (v.getCodeDept().equals("34")) {
					sum += v.getPopulationTotale();
					herault.add(v);
				}
			}
			System.out.println("La population totale de l’Hérault : " + sum);

			// -----La plus petite ville de l'Herault
			Collections.sort(herault, new ReverseHabitant());
			Ville minHerault = herault.get(0);
			System.out.println("\rLa ville la plus petite de l'Herault avec " + minHerault.getPopulationTotale()
					+ " d'habitants : " + minHerault.getNomCommune());

			// -----Les 10 plus petites et plus grandes
			System.out.println("\rLes villes les plus petites de l'Herault : ");
			for (int i = 0; i < 10; i++) {
				System.out.println(herault.get(i).getNomCommune() + " " + herault.get(i).getPopulationTotale());
			}

			System.out.println("\rLes villes les plus grandes de l'Herault  : ");
			Collections.sort(herault, new CompareHabitant());
			for (int i = 0; i < 10; i++) {
				System.out.println(herault.get(i).getNomCommune() + " " + herault.get(i).getPopulationTotale());
			}

			// -----Occitanie
			int occPopTot = 0;
			List<Ville> occitanie = new ArrayList<>();
			for (Ville v : ville) {
				if (v.getCodeRegion().equals("76")) {
					occPopTot += v.getPopulationTotale();
					occitanie.add(v);
				}
			}
			System.out.println("\rLa population totale de l’Occitanie : " + occPopTot);
			
			// -----10 villes d'Occitanie
			Collections.sort(occitanie, new ReverseHabitant());
			System.out.println("\r10 villes les plus petites d'Occitanie  :");
			for (int i = 0; i < 10; i++) {
				System.out.println(occitanie.get(i).getNomCommune() + " " + occitanie.get(i).getPopulationTotale());
			}
			Collections.sort(occitanie, new CompareHabitant());
			System.out.println("\r10 villes les plus grandes d'Occitanie  :");
			for (int i = 0; i < 10; i++) {
				System.out.println(occitanie.get(i).getNomCommune() + " " + occitanie.get(i).getPopulationTotale());
			}

			// -----le département le plus peuplé de la région Occitanie
			HashMap<String, Departement> mapOccitanie = new HashMap<>();

			for (int i = 0; i < occitanie.size(); i++) {
				Ville v = occitanie.get(i);
				String codeDept = v.getCodeDept();
				Departement dept = mapOccitanie.get(codeDept);

				if (dept == null) {
					dept = new Departement(v.getCodeDept());
					mapOccitanie.put(v.getCodeDept(), dept);
				}
				dept.setPopulationTotale(dept.getPopulationTotale() + v.getPopulationTotale());

			}
			System.out.println("\r10 Departements les plus grandes d'Occitanie  :");
			List<Departement> depts = new ArrayList<>(mapOccitanie.values());
			Collections.sort(depts, new CompareDept());
			for (int i = 0; i < 10; i++) {
				System.out.println("Departement : " + depts.get(i).getCodeDept() + ", population : "
						+ depts.get(i).getPopulationTotale());
			}

			// ------10 régions les plus peuplées de France
			HashMap<String, Region> mapRegion = new HashMap<>();
			for (int i = 0; i < ville.size(); i++) {
				Ville v = ville.get(i);
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
			
			// ------les 10 département les plus peuplés de France
			HashMap<String, Departement> mapDept = new HashMap<>();

			for (int i = 0; i < ville.size(); i++) {
				Ville v = ville.get(i);
				String codeDept = v.getCodeDept();
				Departement dept = mapDept.get(codeDept);

				if (dept == null) {
					dept = new Departement(v.getCodeDept());
					mapDept.put(v.getCodeDept(), dept);
				}
				dept.setPopulationTotale(dept.getPopulationTotale() + v.getPopulationTotale());

			}
			System.out.println("\r10 Departements les plus grandes de France  :");
			List<Departement> departements = new ArrayList<>(mapDept.values());
			Collections.sort(departements, new CompareDept());
			for (int i = 0; i < 10; i++) {
				System.out.println("Departement : " + departements.get(i).getCodeDept() + ", population : "
						+ departements.get(i).getPopulationTotale());
			}
			
			// -----10 villes
			System.out.println("\r10 villes les plus petites de France :");
			Collections.sort(ville, new ReverseHabitant());
			int n = 10;
			for (int i = 0; i < n; i++) {
				if (ville.get(i).getPopulationTotale() == 0) {
					System.out.println("Villes detruits " + ville.get(i).getNomCommune() + " "
							+ ville.get(i).getPopulationTotale());
					n += 1;
				} else {
					System.out.println(ville.get(i).getNomCommune() + " " + ville.get(i).getPopulationTotale());
				}
			}
			Collections.sort(ville, new CompareHabitant());
			System.out.println("\r10 villes les plus grandes  de France :");
			for (int i = 0; i < 10; i++) {
				System.out.println(ville.get(i).getNomCommune() + " " + ville.get(i).getPopulationTotale());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
