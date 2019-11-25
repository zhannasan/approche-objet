package maps;

import java.util.Collection;
import sets.Pays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPays {
	private long nHabit;
	private int pib;

	
	public MapPays(long nHabit, int pib) {
		super();
		this.nHabit = nHabit;
		this.pib = pib;
	}
	public String toString(){
		return nHabit+" "+pib;
	}


	public static void main(String[] args) {
		HashMap<String, MapPays> mapPays = new HashMap<String, MapPays>();
		mapPays.put("USA",new MapPays(325084756,59939)); //2017 WorldBank
		mapPays.put("France",new MapPays(64842509,39827));
		mapPays.put("Allemagne",new MapPays(82658409,44680));
		mapPays.put("UK",new MapPays(66727461,39532));
		mapPays.put("Italie",new MapPays(60673701,32038));
		mapPays.put("Japon",new MapPays(127502725,38214));
		mapPays.put("Chine",new MapPays(1421021791,8612));
		mapPays.put("Russie",new MapPays(145530082,10846));
		mapPays.put("Inde",new MapPays(1338676785,1980));

		
		
		
		long min=Long.MAX_VALUE;	
		for(MapPays p : mapPays.values()){
			if (p.nHabit<min){
				min = p.nHabit;
			}
		}
		System.out.println(min);
		
		String minP=null;
		 for (Map.Entry<String, MapPays> entry : mapPays.entrySet()) {
	            if (entry.getValue().getnHabit()==min){
					min = entry.getValue().getnHabit();
					minP = entry.getKey();
					System.out.println("Le moins d’habitants : "+minP);
	            }
	        }
		 mapPays.remove(minP);
		 Set <String> keySet = mapPays.keySet();
		 System.out.println(keySet);
		
	}


	public long getnHabit() {
		return nHabit;
	}


	public void setnHabit(long nHabit) {
		this.nHabit = nHabit;
	}


	public int getPib() {
		return pib;
	}


	public void setPib(int pib) {
		this.pib = pib;
	}

}
