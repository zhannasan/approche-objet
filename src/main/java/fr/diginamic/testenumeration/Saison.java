package fr.diginamic.testenumeration;

public enum Saison{
	PRINTEMPS("Printemps",1) , 
	ETE("Ete",2), 
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	private final String saison;
	private final int num;
	
	private Saison(String saison, int num) {
		this.saison = saison;
		this.num = num;
	}
	public String getSaison() {
		return saison;
	}
	public static Saison getSaison2(String nom) {
		Saison[] seasons = Saison.values();
		for(Saison s: seasons){
			if(s.getSaison().equals(nom)){
				return s;
			}
		}
		return null;
	}
	
	public static int getSaison(String nom) {
		Saison[] seasons = Saison.values();
		for(Saison s: seasons){
			if(s.name().equals(nom)){
				return s.getNum();
			}
		}
		return 0;
	}
	
	public int getNum() {
		return num;
	}

}
