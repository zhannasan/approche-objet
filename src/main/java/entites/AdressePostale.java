package entites;

public class AdressePostale {
	 int numeroRue;
	 String nomRue;
	 int codePostal;
	 String ville;
	
	public AdressePostale(int numeroRue, String nomRue, int codePostal, String ville){
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostal =codePostal;
		this.ville = ville;
	}
		
	public String afficherAddress(){
		return this.numeroRue+" "+this.nomRue+" "+this.codePostal+" "+this.ville;
	}
}
