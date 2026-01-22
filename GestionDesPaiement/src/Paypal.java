public class Paypal extends Paiement {
    private String adresseEmail;

    public Paypal(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }


    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " DH effectué via PayPal ("
                + adresseEmail + ").");
    }
}
