public class GestionBibliothequeApp {
    public static void main(String[] args) {

        // Création des objets
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");

        Utilisateur utilisateur = new Utilisateur("Ahmed");

        // Emprunts
        utilisateur.emprunterObjet(livre1);
        utilisateur.emprunterObjet(dvd1);

        // Tentative de ré-emprunt
        utilisateur.emprunterObjet(livre1);

        // Retours
        utilisateur.retournerObjet(livre1);
        utilisateur.retournerObjet(dvd1);
    }
}
