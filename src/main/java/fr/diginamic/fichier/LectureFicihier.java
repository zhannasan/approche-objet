package fr.diginamic.fichier;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

import org.apache.commons.io.FileUtils;

public class LectureFicihier {

	public static void main(String[] args){
		try{
			File file = new File("C:/Users/jsant/Documents/Docs/Formations/Diginamic/Materials/JAVA/OOPJ5/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			System.out.println("Nombre de lignes :" + lignes.size());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
