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
}
