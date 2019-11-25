package fr.diginamic.jdr;

public class Personnage{
	private int force;
	private int pointsDeVie;
	private int score;
	
	public Personnage(int force, int pointsDeVie, int score) {
		this.force=force;
		this.pointsDeVie=pointsDeVie;
		this.score = score;
	}

	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * @return the pointsDeVie
	 */
	public int getPointsDeVie() {
		return pointsDeVie;
	}

	/**
	 * @param pointsDeVie the pointsDeVie to set
	 */
	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/*@Override
	public String getType() {
		return null;
	}*/
	

}
