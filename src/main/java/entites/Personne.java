package entites;

public class Personne {
	
	String nom;
	String prenom;
	entites.AdressePostale adresse;
	
	Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne (String nom, String prenom, entites.AdressePostale adresse) {
		this(nom, prenom);
		this.adresse = adresse;
	}
	
	public void afficherNoms(String nom, String prenom){
		System.out.println(nom.toUpperCase()+" "+prenom);
		
	}
	
	public void setNewName(String nom){
		this.nom=nom;
	}
	
	public void setNewSurame(String prenom){
		this.prenom=prenom;
	}
	
	public void setNewAdresse(entites.AdressePostale adresse){
		this.adresse=adresse;
	}

	public String getName(){
		return nom;
	}
	
	public String getSurame(){
		return prenom;
	}
	
	public AdressePostale getAddress(){
		return adresse;
	}
	
	
}
