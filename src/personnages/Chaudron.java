package personnages;

public class Chaudron {
    private int dose;
    private int force;

    public Chaudron(int dose, int force) {
        this.dose = dose;
        this.force = force;
    }

    public boolean resterPotion() {
        return dose != 0;
    }

    // Getters utiles pour les prochaines méthodes :
    public int getDose() {
        return dose;
    }

    public int getForce() {
        return force;
    }

    public void viderUneDose() {
        if (dose > 0) {
            dose--;
        }
    }
}
