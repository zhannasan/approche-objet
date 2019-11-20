package listes;

import java.util.*;

public class TetsListeString {

	public static void main(String[] args) {
		List<String> villes = new ArrayList<String>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");
		
		int maxInd = 0;
		int max = 0;
		for(int i=0; i<villes.size(); i++){
			if(villes.get(i).length() >= max){
				maxInd =  i;
				max = villes.get(i).length();
			}else{
				maxInd = maxInd;
			}
		}
		System.out.println(villes.get(maxInd)+" "+max+" letters");

		for(int i=0; i<villes.size(); i++){
			String ville = villes.get(i).toUpperCase();
			villes.set(i, ville);
		}
		System.out.println(villes);
		
		System.out.println();
		for(int i=0; i<villes.size(); i++){
			if(villes.get(i).charAt(0) =='N'){ //or villes.get(i).startsWith("N")
				villes.remove(i);
			}
		}
		System.out.println(villes);
	}

}
