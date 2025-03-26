package test_fonctionnel;

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
	}

}
