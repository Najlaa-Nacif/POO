public class Livre {
    private String titre;
    private int ISBN ;
    private Auteur auteur;

    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre [ISBN : " + ISBN + ", Titre : " + titre + ", " + auteur + "]";

    }
}
