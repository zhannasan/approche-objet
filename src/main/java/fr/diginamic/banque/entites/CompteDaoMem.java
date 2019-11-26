package fr.diginamic.banque.entites;

import java.util.ArrayList;
import java.util.List;

public class CompteDaoMem implements CompteDao{
	private List<Compte> comptes = new ArrayList<Compte>();

	@Override
	public List<Compte> lister() {
		return comptes;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		List<Compte> ncomptes = new ArrayList<Compte>(comptes.size()+1);
		ncomptes.addAll(comptes);
		ncomptes.add(nvCompte);
		comptes = ncomptes;
	}

	@Override
	public boolean supprimer(int numero) {
		List<Compte> ncomptes = new ArrayList<Compte>(comptes.size()-1);
		int j=-1;
		if (comptes.size()>0){
			for (int i=0; i<comptes.size(); i++){	
				if (comptes.get(i).getNumeroCompte()==Integer.valueOf(numero)){
					j=i;
					comptes.remove(j);
				}
			}
	
			if (j>=0){	
				ncomptes.addAll(comptes);
			}
			comptes = ncomptes;
			return true;
		}
		return false;
	}

	@Override
	public boolean existe(int numero) {
		for(Compte c : comptes){
			if(c.getNumeroCompte()==numero){
				return true;
			}
		}
		return false;
	}

	@Override
	public Compte getCompte(int numero) {
		for(Compte c : comptes){
			if(c.getNumeroCompte()==numero){
				return c;
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
