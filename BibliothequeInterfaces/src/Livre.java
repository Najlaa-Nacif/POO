public class Livre implements Empruntable {

    private String titre;
    private String auteur;
    private boolean emprunt;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunt = false; // pas emprunté au départ
    }

    @Override
    public void emprunter() {
        if (!emprunt) { // si pas encore emprunté
            emprunt = true;
            System.out.println("Le livre " + titre + " a été emprunté.");
        } else {
            System.out.println("Le livre " + titre + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (emprunt) { // si emprunté
            emprunt = false;
            System.out.println("Le livre " + titre + " a été retourné.");
        } else {
            System.out.println("Le livre " + titre + " n'était pas emprunté.");
        }
    }
}
