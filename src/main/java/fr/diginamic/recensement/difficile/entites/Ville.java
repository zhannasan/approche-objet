package fr.diginamic.recensement.difficile.entites;

public class Ville {
	private String codeRegion;
	private String nomRegion;
	private String codeDept;
	private String codeCommune;
	private String nomCommune;
	private int populationTotale;
	
	public Ville(String codeRegion, String nomRegion, String codeDept, String codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	};
	
	public String toString(){
		return codeRegion+" "+nomRegion+" "+codeDept+" "+ codeCommune+" "+ nomCommune+" "+ populationTotale;
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
	 * @return the codeDept
	 */
	public String getCodeDept() {
		return codeDept;
	}

	/**
	 * @param codeDept the codeDept to set
	 */
	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}

	/**
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
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
