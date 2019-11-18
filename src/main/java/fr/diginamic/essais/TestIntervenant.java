package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		Salaire income = new Salaire( "Mitchel","David", 2200.);
		Pigiste paycheck = new Pigiste("Gayman", "Neil", 17, 180.);
		System.out.println(income.getSalaire());
		System.out.println(paycheck.getSalaire());
		
		income.afficherDonnees();
		paycheck.afficherDonnees();
			
	}

}
