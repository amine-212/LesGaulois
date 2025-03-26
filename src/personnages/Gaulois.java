package personnages;

import java.security.PublicKey;
import personnages.Romain;
import village.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	
	public Gaulois(String nom, int force) {
		this.nom= nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
		
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		
	
	}

	public String prendreParole() {
		// TODO Auto-generated method stub
		return "Le gauloius " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
	    System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	    romain.recevoirCoup((force * effetPotion) / 3);
	    if (effetPotion > 1) {
	        effetPotion--;
	    }
	}

	
	public void boirePotion(int effet) {
	    this.effetPotion = effet;
	}
	
	public Village getVillage() {
        return village;
    }

	public void sePresenter() {
		if (village != null && village.getChef() == this) {
	        parler("Bonjour, je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".");
	    } else if (village != null) {
	        parler("Bonjour, je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".");
	    } else {
	        parler("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
	    }
	}
	
	
	
	@Override
	public String toString() {
		return "\"" + nom + "\"";
	}

	public static void main(String[] arg) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		System.out.println(asterix);
	}

	
	
	
	
	
	
	
	

}
