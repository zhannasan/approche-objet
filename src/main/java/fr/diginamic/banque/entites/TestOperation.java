package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.*;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] tabOp = new Operation[4];
		tabOp[0] = new Debit("24/08/2019",231.8);
		tabOp[1] = new Credit("07/09/2019",400.0);
		tabOp[2] = new Debit("16/10/2019",134.0);
		tabOp[3] = new Credit("17/10/2019",205.0);
		
		double solde=0.0;
		for (int i=0; i<tabOp.length; i++){
			
			if(tabOp[i].getType().equals("DEBIT")){
				solde -= tabOp[i].getMontantOp();
				System.out.println(tabOp[i]);
				
			}else if(tabOp[i].getType().equals("CREDIT")){
				solde += tabOp[i].getMontantOp();
				System.out.println(tabOp[i]);
			}
		}
		System.out.println("Solde final "+solde);
	}

}
