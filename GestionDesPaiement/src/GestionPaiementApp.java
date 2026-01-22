public class GestionPaiementApp {
    public static void main(String[] args) {

        Paiement carte = new CarteCredit(12345678);
        Paiement paypal = new Paypal("client@gmail.com");

        Commande commande1 = new Commande(500, carte);
        Commande commande2 = new Commande(250, paypal);

        commande1.processPayment();
        commande2.processPayment();
    }
}
