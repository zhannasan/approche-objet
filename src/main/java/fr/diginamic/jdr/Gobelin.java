package fr.diginamic.jdr;

public class Gobelin extends Creature{

	public Gobelin(int force, int pointsDeVie) {
		super(force, pointsDeVie);
	}

	@Override
	public String getType() {
		return "Gobelin";
	}

}
