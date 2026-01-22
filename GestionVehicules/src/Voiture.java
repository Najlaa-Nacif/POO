public class Voiture extends Vehicule {
    private String modele;
    private int annee;

    public Voiture(String nomVehicule, double prixVehicule, String modele, int annee) {
        super(nomVehicule, prixVehicule);
        this.modele = modele;
        this.annee = annee;
    }

    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");

    }

    @Override
    public void afficherInformations() {
        super.afficherInformations(); // Affiche nom et prix
        System.out.println("Modèle : " + modele + ", Année : " + annee);
    }

    @Override
    public String toString() {
        return " Voiture { modele= " + modele +
                " , annee= " + annee +
                super.toString();

    }
}

