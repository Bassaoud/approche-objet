package entites;

public class Personne {
 String nom;
 String prenom;
 String adressePostale;
 
public Personne(String nom, String prenom, String adressePostale) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adressePostale = adressePostale;
}

@Override
public String toString() {
	return "Personne [nom=" + nom + ", prenom=" + prenom + ", adressePostale=" + adressePostale + "]";
}
 
 
}
