public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle() {
    }

    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return (2 * (longueur + largeur));
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
    }

    @Override
    public String toString() {
        return super.toString() +
                " , Longueur = " + longueur +
                " , larguer = " + largeur +
                " , Air = " + calculerAire() +
                " , Perimetre = " + calculerPerimetre()+
                '}';
    }
}
