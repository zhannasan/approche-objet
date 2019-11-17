package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.*;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(6.5);
		Cercle c2 = new Cercle(1.0);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(CercleFactory.makeCercle(4)); 
	}

}
