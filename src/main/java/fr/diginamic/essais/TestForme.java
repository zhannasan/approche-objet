package fr.diginamic.essais;

import fr.diginamic.formes.*;
import fr.diginamic.essais.*;

public class TestForme {

	public static void main(String[] args) {
		Cercle circle = new Cercle(1.0);
		Rectangle rec = new Rectangle(2.,3.);
		Carre square = new Carre(2.,3.);//only the first parameter is taken as a longueur
		
		AffichageForme.afficher(circle);
		AffichageForme.afficher(rec);
		AffichageForme.afficher(square);
	}

}
