package fr.diginamic.recensement.difficile.entites;

public class Region {
	private String codeRegion;
	private String nomRegion;
	private int populationTotale;
	
	/**
	 * @param codeRegion
	 * @param nomRegion
	 */
	public Region(String codeRegion, String nomRegion) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
	}

	/**
	 * @param codeRegion
	 * @param nomRegion
	 * @param populationTotale
	 */
	public Region(String codeRegion, String nomRegion, int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}
	
	public String toString(){
		return codeRegion+" "+nomRegion+" "+populationTotale;
	}
	/**
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}
	/**
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}
	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}
	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	/**
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}
	/**
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

}
