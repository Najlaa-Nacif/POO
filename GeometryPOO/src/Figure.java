public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }
    public Figure() {

    }


    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public void afficherDetails(){
        System.out.println("Figure : " + nom);
        System.out.println("Aire : " + calculerAire());
        System.out.println("Périmètre : " +calculerPerimetre() );


    }



    @Override
    public String toString() {
        return "Figure { " +
                " nom = " + nom
                ;
    }
}
