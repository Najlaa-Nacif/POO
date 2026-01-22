public abstract class Paiement {
    private double montant;
    private int numeroDeTransaction ;

    public abstract void effectuerPaiement(double montant);
}
