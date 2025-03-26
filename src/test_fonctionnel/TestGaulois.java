package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	
	public static void main(String[] arg) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("obélix", 16);
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour Obelix.");
		obelix.parler("Bopnjour Astérix. Ca te dirais d'aller chasser des sangliers ?)");
		asterix.parler("Oui tres bonne idée.");
		System.out.println("Dans la foret Astérix et Obélix tombe nez a nez sur le romain Minus.");
		asterix.frapper(minus);
		minus.parler("Aie");
		asterix.frapper(minus);
		minus.parler("Aie");
		asterix.frapper(minus);
		minus.parler("J'abandonne !");
		
		 Romain brutus = new Romain("Brutus", 14);
		 Druide panoramix = new Druide("Panoramix", 2);
		 panoramix.fabriquerPotion(4, 3);

		 panoramix.boosterGaulois(obelix);
		 panoramix.boosterGaulois(asterix);

		  for (int i = 0; i < 3; i++) {
		      asterix.frapper(brutus);
		      if (i < 2) {
		          brutus.parler("Aïe");
		      } else {
		          brutus.parler("J'abandonne !");
		      }
		  }
	}
}


