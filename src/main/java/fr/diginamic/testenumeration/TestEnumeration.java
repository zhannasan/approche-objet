package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] seasons = Saison.values();
		for(Saison s: seasons){
			System.out.println(s.getSaison()+" "+s.getNum()+" "+s.name());
		}
		
		
		String nom="ETE";
		int ses =0 ;
		for(Saison s: seasons){
			ses=s.getSaison(nom);
		}
		System.out.println(ses);
		
		String libelle ="Hiver";
		Saison sea=null;
		for(Saison s: seasons){
			sea=s.getSaison2(libelle);
		}
		System.out.println(sea);
		
	}

}
