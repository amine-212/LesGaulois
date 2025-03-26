package personnages;

public class Druide {
	private String nom;
	private int forcePotion;
	private int quantitePotion;
	
	
	public Druide(String nom, int force, int quantite) {
		this.nom= nom;
		this.forcePotion=force;
		this.quantitePotion= quantitePotion;
	}
	
	public void parler(String texte) {
		System.out.println("Le Druide" + nom + "J'ai concocté" + quantitePotion + "doses de potion magique. Elle a une force de " + forcePotion + ".");
		
	
	}

	public String prendreParole() {
		// TODO Auto-generated method stub
		return "Le Druide " + nom + " : ";
	}
	
	public String getNom() {
		return nom;
	}
	
	public void fabriquerPotion(int doses, int forcePotion) {
		quantitePotion = doses;
		System.out.println("Le Druide" + nom + "J'ai concocté" + quantitePotion + "doses de potion magique. Elle a une force de " + forcePotion + ".");
		
		
	}

}
