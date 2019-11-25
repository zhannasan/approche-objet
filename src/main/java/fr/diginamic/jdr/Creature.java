package fr.diginamic.jdr;

public abstract class Creature {
	private int force;
	private int pointsDeVie;
	
	/**
	 * @param force
	 * @param pointsDeVie
	 */
	public Creature(int force, int pointsDeVie) {
		this.force = force;
		this.pointsDeVie = pointsDeVie;
	}
	
	public abstract String getType();
}
