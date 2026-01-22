public class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;

    }
    public Manager() {
        super();
    }

    @Override
    public double calculerSalaire() {
        return getSalaire()*1.20;
    }

    @Override
    public String toString() {
        return "Manager {"+ super.toString() + " , service = " + service + " }";
    }
}
