package maps;

import java.util.Collection;
import sets.Pays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class MapPays {

	public static void main(String[] args) {
		HashMap<Pays> mapPays = new HashMap<Pays>();
		

		
		Set <String> keySet = mapPays.keySet();
		//Set <Integer> valSet = (Set<Integer>) mapPays.values();
		int max=0;
		String maxPays=null;
		for (String key : keySet){
			if(mapPays.get(key)>=max){
				max = mapPays.get(key);
				maxPays = key;
			}
			System.out.println(key+" "+mapPays.get(key));
		}
		System.out.println(maxPays+" "+mapPays.get(max));
		
		
		
		
		System.out.println(max+" "+mapPays.get(max));
	}

}
