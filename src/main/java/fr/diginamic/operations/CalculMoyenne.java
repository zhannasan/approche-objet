package fr.diginamic.operations;

public class CalculMoyenne {
	double[] tab;
	
	public CalculMoyenne() {
	}
	
	public static double[] ajout(double[] tab, double a){
		double[] newtab = new double[tab.length+1];
		for (int i=0; i<tab.length; i++){
			newtab[i]= tab[i];
		}
		newtab[tab.length]=a;
		return newtab;
	}
	
	public static double calcul(double[] tab){
		double sum = 0;
		for (int i=0; i<tab.length; i++){
			sum += tab[i];
		}
		double mean=sum/tab.length;
		return mean;
	}
}
