import java.util.*;

public class FilmeVerwalter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFilme = 6;
        String[] titel = new String[maxFilme];
        String[] regisseur = new String[maxFilme];
        String[] hauptDarsteller = new String[maxFilme];
        int[] erscheinungsjahr = new int[maxFilme];
        int anzahlFilme = 0;
    

        titel[0] = "Matrix 1";
        regisseur[0] = "Wachowsky Brothers";
        hauptDarsteller[0] = "Keanu";
        erscheinungsjahr[0] = 1999;

        titel[1] = "Matrix 2";
        regisseur[1] = "Wachowsky Brothers";
        hauptDarsteller[1] = "Keanu";
        erscheinungsjahr[1] = 2003;

        titel[2] = "Der Herr der Ringe";
        regisseur[2] = "Peter Jackson";
        hauptDarsteller[2] = "Viggo Mortensen";
        erscheinungsjahr[2] = 2001;

        titel[3] = "Paddington";
        regisseur[3] = "?";
        hauptDarsteller[3] = "Ben Wisher";
        erscheinungsjahr[3] = 2017;

        anzahlFilme = 4;

        while (true) {
            System.out.println("Gib den Titel des Films ein (oder 'exit' zum Beenden): ");
            String filmTitel = scanner.nextLine();
            if (filmTitel.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Gib den Regisseur des Films ein: ");
            String filmRegisseur = scanner.nextLine();

            System.out.println("Gib den Hauptdarsteller des Films ein: ");
            String filmHauptDarsteller = scanner.nextLine();

            System.out.println("Gib das Erscheinungsjahr des Films ein: ");
            int filmErscheinungsjahr = scanner.nextInt();
            scanner.nextLine(); // Puffer leeren

            // Film hinzufuegen
            if (anzahlFilme < maxFilme) {
                titel[anzahlFilme] = filmTitel;
                regisseur[anzahlFilme] = filmRegisseur;
                erscheinungsjahr[anzahlFilme] = filmErscheinungsjahr;
                hauptDarsteller[anzahlFilme] = filmHauptDarsteller;
                anzahlFilme++;
            } else {
                System.out.println("Die Filmesammlung ist voll!");
                break;
            }
        }

        // Alle Filme anzeigen
        System.out.println("Filmesammlung:");
        for (int i = 0; i < anzahlFilme; i++) {
            System.out.println("Titel: " + titel[i] + ", Regisseur: " + regisseur[i] + ", Erscheinungsjahr: " +
                    erscheinungsjahr[i] + ", Hauptdarsteller: " + hauptDarsteller[i]);
        }

        scanner.close();

        System.out.println(Arrays.toString(titel));
        System.out.println(Arrays.toString(regisseur));
        System.out.println(Arrays.toString(erscheinungsjahr));
        System.out.println(Arrays.toString(hauptDarsteller));
    }
}
