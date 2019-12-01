package fr.diginamic.recensement.difficile.entites;

public class Departement {
	private String codeDept;
	private int populationTotale;
	
	/**
	 * @param codeDept
	 * @param populationTotale
	 */
	public Departement(String codeDept, int populationTotale) {
		super();
		this.codeDept = codeDept;
		this.populationTotale = populationTotale;
	}
	
	/**
	 * @param codeDept
	 */
	public Departement(String codeDept) {
		super();
		this.codeDept = codeDept;
	}



	public String toString(){
		return codeDept+" "+populationTotale;
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
