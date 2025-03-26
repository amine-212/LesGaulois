package personnages;

public class Druide {
    private String nom;
    private int force;
    private Chaudron chaudron;

    public Druide(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le Druide " + nom + " : ";
    }
    
    public void fabriquerPotion(int dose, int force) {
        chaudron = new Chaudron(dose, force);
        parler("J'ai concocté " + dose + " doses de potion magique. Elle a une force de " + force + ".");
    }
    
    public void boosterGaulois(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else if (chaudron != null && chaudron.resterPotion()) {
            parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
            gaulois.boirePotion(chaudron.getForce());
            chaudron.viderUneDose();
        }
    }

    
    
    
}


