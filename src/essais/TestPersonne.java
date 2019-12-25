package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne1 = new Personne("Dupont", "Nicolas", "9 rue de la Verdure");
		Personne personne2 = new Personne("Marrote","Lolita", "89 avenue du General De Gaulle");
		System.out.println("Coordonnées de la 1 ére personne "+personne1);
		System.out.println("Coordonnées de la 2 éme personne "+personne2);
	}

}
