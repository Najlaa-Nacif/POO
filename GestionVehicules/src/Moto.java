public class Moto extends Vehicule {
    private String marque;
    private int puissance;

    public Moto(String nomVehicule, double prixVehicule, String marque, int puissance) {
        super(nomVehicule, prixVehicule);
        this.marque = marque;
        this.puissance = puissance;
    }

    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Marque : " + marque
                + " , Puissance : " + puissance);
    }

    @Override
    public String toString() {
        return "Moto { " +
                " marque = " + marque +
                " , puissance= " + puissance + super.toString();

    }
}
