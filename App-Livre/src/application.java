public class application {
    public static void main(String[] args) {

        Adherent adr = new Adherent(
                "Alaoi",
                "laila",
                "laila@gmail.com",
                "9999999",
                13,
                12
        );
        System.out.println("Adherent : " + adr);

        Auteur auteur = new Auteur(
                "Sefrioui",
                "Ahmed",
                "Sefriou@gmail.com",
                "11111111",
                60,
                11
        );

        Livre livre = new Livre(
                1,
                "La Boîte à merveilles",
                auteur
        );

        System.out.println("Livre : " + livre);
    }
}
