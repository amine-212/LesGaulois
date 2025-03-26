package village;

import personnages.Gaulois;

public class Village {
	private String nom;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, Gaulois chef, int nbVillageoisMaximum) {
	    this.nom = nom;
	    this.chef = chef;
	    this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	
	public Gaulois ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
	    nbVillageois++;
		return gaulois;
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		 int indice = numVillageois - 1;
		    if (indice >= 0 && indice < nbVillageois) {
		        return villageois[indice];
		    } else {
		        System.out.println("Il n’y a pas autant d’habitants dans notre village !");
		        return null;
		    }
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
	    System.out.println("vivent les légendaires gaulois :");
	    for (int i = 0; i < nbVillageois; i++) {
	        System.out.println("- " + villageois[i].getNom());
	    }
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		Gaulois gaulois = village.trouverVillageois(30);
		Gaulois astérix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(astérix);
		gaulois = village.trouverVillageois(1); 
		System.out.println(gaulois); 
		gaulois = village.trouverVillageois(2); 
		System.out.println(gaulois);
		Gaulois obélix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obélix);
		village.afficherVillageois();
		Gaulois doublépolemix = new Gaulois("Doublepolémix", 4);
	    abraracourcix.sePresenter();
	    astérix.sePresenter();
	    doublépolemix.sePresenter();

	}


	public Gaulois getChef() {
	    return chef;
	}

	public String getNom() {
	    return nom;
	}

}
