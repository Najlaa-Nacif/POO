public class test {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Renault ", 15000, "Clio ", 2022);
        voiture.emettreSon();
        voiture.afficherInformations();
        System.out.println(voiture);

        System.out.println("-------------------------");

        Moto moto = new Moto("Yamaha", 12000, "R1", 200);
        moto.emettreSon();
        moto.afficherInformations();
        System.out.println(moto);


        System.out.println("-------------------------");

        Avion avion = new Avion("Boeing 737", 80000000, "Royal Air Maroc", 850);
        avion.emettreSon();
        avion.afficherInformations();
        System.out.println(avion);


    }
}
