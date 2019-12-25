package entites;

public class AdressePostale {
	public int numeroRue;
	public String libelleRue;
	public long codePostal;
	public String ville;

	public AdressePostale(int numeroRue, String libelleRue, long codePostal, String ville) {
		super();
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public long getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(long codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
