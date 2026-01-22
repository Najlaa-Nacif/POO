public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean emprunt;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunt = false;
    }

    public DVD() {
    }

    @Override
    public void emprunter() {
        if (!emprunt) {
            emprunt = true;
            System.out.println("Le DVD " + titre + " a été emprunté.");}
            else{
            System.out.println("Le DVD " + titre + " est déjà emprunté.");
        }


    }

    @Override
    public void retourner() {
        if (emprunt) {
            emprunt = false;
            System.out.println("Le DVD " + titre + " a été retourné.");}
            else{
            System.out.println("Le DVD " + titre + " n'était pas emprunté.");
        }

    }
}
