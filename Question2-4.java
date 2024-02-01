import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Initialisation du tableau des noms de pc
        String[] pc = {"Carte_graphique", "Ssd", "Carte_mere"};

        // Initialisation du tableau des prix HT
        double[] prixHT = new double[pc.length];

        // Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur le prix HT de chaque pc
        for (int i = 0; i < pc.length; i++) {
            System.out.print("Entrez le prix HT de " + pc[i] + " : ");
            prixHT[i] = scanner.nextDouble();
        }

        // Affichage des noms et prixHT des pc
        System.out.println("Liste des pc avec leurs prix HT :");
        for (int i = 0; i < pc.length; i++) {
            System.out.println(pc[i] + " : " + prixHT[i] + " €");
        }

        // Fermeture du scanner
        scanner.close();
    }
}
