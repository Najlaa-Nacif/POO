public class Application {
    public static void main(String[] args) {
        Ingénieur ingénieur = new Ingénieur("nacif", "ilyass", "ilyass@gmail.com", "111111111", 22500, "Informatique");
        double salaire = ingénieur.calculerSalaire();
        System.out.println(ingénieur.toString() + " le salaire après l'augmentation " + salaire);

        System.out.println("________________________________");

        Manager manager = new Manager("El Amrani", "Ahmed", "ahmed@gmail.com", "222222222", 9000, "Ressources Humaines");
        double salaireManager = manager.calculerSalaire();
        System.out.println(manager.toString() + " le salaire après l'augmentation " + salaire);

    }
}