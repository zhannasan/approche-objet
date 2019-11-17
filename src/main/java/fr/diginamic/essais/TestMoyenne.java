package fr.diginamic.essais;

import fr.diginamic.operations.*;

public class TestMoyenne {

	public static void main(String[] args) {
		double[] tab = {2.,5.,3.,1.,2.};
		tab = CalculMoyenne.ajout(tab, 2.0);
		System.out.println(CalculMoyenne.calcul(tab));
		//checking the new table
		System.out.println("new "+tab.length);
		for(int i=0; i<tab.length;i++){
			System.out.println(tab[i]);
		}
				
		double[] tab2 = {3.,7.,5.,11.,1.,13.};
		tab2 = CalculMoyenne.ajout(tab2, 17.0);
		System.out.println(CalculMoyenne.calcul(tab2));
		
		double[] tab3 = {35.1, 74.2 ,5.};
		tab3 = CalculMoyenne.ajout(tab3, 7.4);
		System.out.println(CalculMoyenne.calcul(tab3));
		
	}

}
