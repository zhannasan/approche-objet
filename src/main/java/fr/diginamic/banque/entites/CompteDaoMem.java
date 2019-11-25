package fr.diginamic.banque.entites;

public class CompteDaoMem implements CompteDao{
	private Compte[] comptes = new Compte[0];

	@Override
	public Compte[] lister() {
		return comptes;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		Compte[] ncomptes = new Compte[comptes.length+1];
		for (int i=0; i<comptes.length; i++){
			ncomptes[i]= comptes[i];
		}
		ncomptes[comptes.length]=nvCompte;
		comptes = ncomptes;
	}

	@Override
	public boolean supprimer(int numero) {
		Compte[] ncomptes = new Compte[comptes.length-1];
		int j=-10;
		if (comptes.length>0){
			for (int i=0; i<comptes.length; i++){	
				if (comptes[i].getNumeroCompte()==Integer.valueOf(numero)){
					j=i;
				}
			}
			if (j>=0){
				for (int i=0; i<j; i++){	
					ncomptes[i]= comptes[i];
				}
				for (int i=j; i<comptes.length-1; i++){	
					ncomptes[i]= comptes[i+1];
				}
				comptes = ncomptes;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean existe(int numero) {
		for(int i=0; i<comptes.length;i++ ){
			if(comptes[i].getNumeroCompte()==numero){
				return true;
			}
		}
		return false;
	}

	@Override
	public Compte getCompte(int numero) {
		for(int i=0; i<comptes.length;i++ ){
			if(comptes[i].getNumeroCompte()==numero){
				return comptes[i];
			}
		}
		return null;
	}

	/**
	 * @param comptes
	 */
	public CompteDaoMem() {
		super();
	}
	
}
