package fr.diginamic.recensement.difficile.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import fr.diginamic.recensement.difficile.entites.Ville;
import fr.diginamic.recensement.difficile.entites.Recensement;

public class ReadCsvFile {
	
	public static Recensement read(String path){
		Recensement recensement = new Recensement();
		try{
		File file = new File(path);
		List<String> lines = FileUtils.readLines(file, "UTF-8");
		int populationTotale = 0;
		for (String line : lines) {
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
				System.out.println(nfe.getMessage());
			}
			Ville v = new Ville(codeRegion, nomRegion, codeDept, codeCommune, nomCommune, populationTotale);
			recensement.getVille().add(v);
		}
		recensement.getVille().remove(0);
		return recensement;
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
