public class Avion extends Vehicule {
    private String compagnie;
    private int vitesseMax;

    public Avion(String nomVehicule, double prixVehicule, String compagnie, int vitesseMax) {
        super(nomVehicule, prixVehicule);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println(" Compagnie : " + compagnie + " Vitesse max : " + vitesseMax);
    }

    @Override
    public String toString() {
        return "Avion { " +
                " compagnie = " + compagnie +
                " , vitesseMax = " + vitesseMax
                + super.toString();

    }
}
