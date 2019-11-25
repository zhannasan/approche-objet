package fr.diginamic.jdr;

public class Loup extends Creature{

	/**
	 * @param force
	 * @param pointsDeVie
	 */
	public Loup(int force, int pointsDeVie) {
		super(force, pointsDeVie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "Loup";
	}

}
