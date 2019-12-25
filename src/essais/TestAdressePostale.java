package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale addresse1 = new AdressePostale(949, "Avenue Louis Ravas", 34080, "Montpellier");
		//AdressePostale addresse2 = new AdressePostale();
		
		addresse1.setNumeroRue(959);
		addresse1.setVille("Nimes");
		
		System.out.println(addresse1);

	}

}
