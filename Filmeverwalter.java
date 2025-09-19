import java.util.*;

public class FilmeVerwalter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFilme = 6;
        String[] regisseur = { "Wachowsky Brothers", "Wachowsky Brothers", "Peter Jackson", "?" };
        String[] titel = { "Matrix 1", "Matrix 2", "Der Herr der Ringe", "Paddington" };
        String[] hauptDarsteller = { "Keanu", "Keanu", "Viggo Mortensen", "Ben Wisher" };
        int[] erscheinungsjahr = { 1999, 2003, 2001, 2017 };
        int anzahlFilme = 4;

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
                    erscheinungsjahr[i] + ", Hauptdarsteller" + hauptDarsteller[i]);
        }

        scanner.close();

        System.out.println(Arrays.toString(titel));
        System.out.println(Arrays.toString(regisseur));
        System.out.println(Arrays.toString(erscheinungsjahr));
        System.out.println(Arrays.toString(hauptDarsteller));
    }
}
