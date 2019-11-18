package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class AffichageForme {
	
	public static void afficher(Formes a){
		System.out.println(a.calculerPerimetre());
		System.out.println(a.calculerSurface());
	}
}
