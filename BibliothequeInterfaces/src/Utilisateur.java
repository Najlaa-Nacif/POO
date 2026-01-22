public class Utilisateur {

    private String nomutilisateur;

    public Utilisateur(String nom) {
        this.nomutilisateur = nom;
    }

    public void emprunterObjet(Empruntable objet) {
        objet.emprunter();
    }

    public void retournerObjet(Empruntable objet) {
        objet.retourner();
    }
}
