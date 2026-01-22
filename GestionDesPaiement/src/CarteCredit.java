public class CarteCredit extends Paiement {
    private int numeroDeCarte;

    public CarteCredit(int numeroDeCarte) {
        this.numeroDeCarte = numeroDeCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " DH effectué via Carte de Crédit ("
                + numeroDeCarte + ").");
    }
}
