package tri;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import sets.Pays;

public class PaysTri  {

	public static void main(String[] args) {
		List <Pays> listPays = new ArrayList<Pays>();
		listPays.add(new Pays ("USA",325084756,59939)); //2017 WorldBank
		listPays.add(new Pays ("France",64842509,39827));
		listPays.add(new Pays ("Allemagne",82658409,44680));
		listPays.add(new Pays ("UK",66727461,39532));
		listPays.add(new Pays ("Italie",60673701,32038));
		listPays.add(new Pays ("Japon",127502725,38214));
		listPays.add(new Pays ("Chine",1421021791,8612));
		listPays.add(new Pays ("Russie",145530082,10846));
		listPays.add(new Pays ("Inde",1338676785,1980));

		Collections.sort(listPays);
		for(Pays p: listPays){
	    	 System.out.println(p.toString());
	     }
		System.out.println("\r");
		
		Collections.sort(listPays, new ComparatorHabitant());
		for(Pays p: listPays){
	    	 System.out.println(p.toString());
	     }
		System.out.println("\r");
		
		Collections.sort(listPays, new ComparatorPibHabitant());
		for(Pays p: listPays){
	    	 System.out.println(p.toString());
	     }
		
	}

}
