
public class Apprenant {
	private String nom;
	private String prenom;
	private int niveau;
	private String promo;

	public Apprenant(String Nom, String Prenom, int Niveau, String Promo) {
		this.nom = Nom;
		this.prenom = Prenom;
		this.niveau = Niveau;
		this.promo = Promo;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getNiveau() {
		return niveau;
	}
	
	
}
