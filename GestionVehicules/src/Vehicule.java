public class Vehicule {
    private String nomVehicule;
    private double prixVehicule;

    public Vehicule(String nomVehicule, double prixVehicule) {
        this.nomVehicule = nomVehicule;
        this.prixVehicule = prixVehicule;
    }

    public Vehicule() {

    }

    public void emettreSon() {

        System.out.println("Le véhicule émet un son inconnu.");
    }


    public void afficherInformations() {
        System.out.println("nom : " + nomVehicule
                + " , prix  : " + prixVehicule);


    }

    @Override
    public String toString() {
        return
                " , Nom = " + nomVehicule +
                        " , Prix = " + prixVehicule + " }";


    }


}
