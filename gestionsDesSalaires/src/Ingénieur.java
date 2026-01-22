public class Ingénieur extends Employe {
    private String specialite;

    public Ingénieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    public Ingénieur() {
        super();
    }

    @Override
    public double calculerSalaire() {
        return getSalaire()*1.15;
    }

    @Override
    public String toString() {
        return"Ingénieur {" +super.toString()+" , specialite = "+specialite +" }";
    }
}

