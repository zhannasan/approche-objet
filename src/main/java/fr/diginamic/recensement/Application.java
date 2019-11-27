package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class Application {
	 
	public static void main(String[] args) {
		
		try{
			List<Ville> ville=new ArrayList<Ville>();
			File file = new File("C:/Users/jsant/Documents/Docs/Formations/Diginamic/Materials/JAVA/OOPJ5/recensement population 2016.csv");
			List<String> lines = FileUtils.readLines(file, "UTF-8");
			int populationTotale = 0;
			for (String line: lines){
				//System.out.println(line);
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
			//System.out.println(ville.size());
			
//-----Montpellier
				for(Ville v : ville){
					if(v.getNomCommune().equals("Montpellier")){
						System.out.println(v.toString());
					}
				}
//-----Herault
				int sum=0;
				List<Ville> herault = new ArrayList<Ville>();
				for(Ville v : ville){
					if(v.getCodeDept().equals("34")){
						sum+= v.getPopulationTotale();
						herault.add(v);
					}
				}
				System.out.println("La population totale de l’Hérault : "+sum);
//-----La plus petite ville de l'Herault
				Collections.sort(herault, new ReverseHabitant());
				int min = herault.get(0).getPopulationTotale();
				List<String> minV=new ArrayList<String>();
				for(Ville v : herault){
					if(v.getPopulationTotale()<=min){
						minV.add(v.getNomCommune());		
					}
				}
				System.out.println("\rLes villes les plus petites avec "+min+" d'habitants :");
				for(String v : minV){
					System.out.println(v);
				}
//-----Les plus petites				
				Collections.sort(ville, new ReverseHabitant());
				int minF = ville.get(0).getPopulationTotale();
				List<String> minVF=new ArrayList<String>();
				for(Ville v : ville){
					if(v.getPopulationTotale()<=min){
						minVF.add(v.getNomCommune());		
					}
				}
				System.out.println("\rLes villes les plus petites avec "+minF+" d'habitants :");
				for(String v : minVF){
					System.out.println(v);
				}
//-----10 villes
				System.out.println("\r10 villes les plus petites de France :");
				for(int i=0; i<10;i++){
					System.out.println(ville.get(i).getNomCommune()+" "+ville.get(i).getPopulationTotale());
				}
				Collections.sort(ville, new CompareHabitant());
				System.out.println("\r10 villes les plus grandes  de France :");
				for(int i=0; i<10;i++){
					System.out.println(ville.get(i).getNomCommune()+" "+ville.get(i).getPopulationTotale());
				}
//-----Occitanie
				sum=0;
				List<Ville> occitanie = new ArrayList<>();
				for(Ville v : ville){
					if(v.getCodeRegion().equals("76")){
						sum+= v.getPopulationTotale();
						occitanie.add(v);
					}
				}
				System.out.println("\rLa population totale de l’Occitanie : "+sum);
//-----10 villes d'Occitanie
				Collections.sort(occitanie, new ReverseHabitant());
				System.out.println("\r10 villes les plus petites d'Occitanie  :");
				for(int i=0; i<10;i++){
					System.out.println(occitanie.get(i).getNomCommune()+" "+occitanie.get(i).getPopulationTotale());
				}
				Collections.sort(occitanie, new CompareHabitant());
				HashMap<String, Integer> nHab = new HashMap<>();
				for (int i=0; i<occitanie.size(); i++){
					Ville o = occitanie.get(i);
					String numDept = o.getCodeDept();
					Integer compteur = nHab.get(numDept);
					if (compteur==null){
						compteur = 0;
					}
					compteur++;
					nHab.put(numDept, compteur);
				}
			Set<String> departements = nHab.keySet();
			Iterator<String> it = departements.iterator();
			while (it.hasNext()) {
				String dept = it.next();
				Integer compteur = nHab.get(dept);
				System.out.println("Departement:" + dept + ". Nb de villes :" + compteur);
			}
			List<Integer> occDeptNHab = new ArrayList<>();
			
					//System.out.println(departements+" "+compteur);
				
//-----10Regions
				HashMap<String, Integer> compteurs = new HashMap<>();
				for (int i=0; i<ville.size(); i++){
					Ville v = ville.get(i);
					String nomReg = v.getNomRegion();
					Integer compteur = compteurs.get(nomReg);
					if (compteur==null){
						compteur = 0;
					}
					compteur++;
					compteurs.put(nomReg, compteur);
				}
			Set<String> categories = compteurs.keySet();
			Iterator<String> iterateur = categories.iterator();
			while (iterateur.hasNext()) {
				String categorie = iterateur.next();
				Integer compteur = compteurs.get(categorie);
				//System.out.println("Categorie:" + categorie + " - Nb articles:" + compteur);
			}				
			System.out.println( categories);		
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	/*public static List<Ville> readFile(String path){
	/*String[] columns;
	String codeRegion = null;
	String nomRegion = null;
	String codeDept = null;
	String codeCommune = null;
	String nomCommune = null;
	String population;
	String pop=null;
	
	//return ville;
}*/

}
