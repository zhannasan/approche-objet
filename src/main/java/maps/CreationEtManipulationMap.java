package maps;

import java.util.*;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Set <Integer> keySet = mapVilles.keySet();
				for (Integer key : keySet){
					System.out.println(key+" "+mapVilles.get(key));
				}
		//entrySet
		Set entrySet = mapVilles.entrySet();
		Iterator iter = entrySet.iterator();
	    
	    while(iter.hasNext()){
	       Map.Entry me = (Map.Entry)iter.next();
	       System.out.println(me.getKey() + " "+me.getValue());
	   }
		
		System.out.println(mapVilles.size());
	}

}
