public class Application {
    public static void main(String[] args) {

        // Création des objets
        Figure cercle = new Cercle("Cercle", 5);
        Figure rectangle = new Rectangle("Rectangle", 4, 6);

        // Affichage des détails
        cercle.afficherDetails();
        System.out.println(cercle);
        System.out.println("____________________________");
        rectangle.afficherDetails();
        System.out.println(rectangle);

    }
}