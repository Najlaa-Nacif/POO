
public class Cercle extends Figure {

    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }
    public Cercle() {}

    @Override
    public double  calculerAire() {
        return rayon*rayon*Math.PI;
    }

    @Override
    public double calculerPerimetre() {
        return 2*rayon*Math.PI;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
    }

    @Override
    public String toString() {
        return super.toString()+
                " , rayon = " + rayon+
                " , Air = " + calculerAire()+
                " , perimetre = " + calculerPerimetre()+
                '}';

    }
}

