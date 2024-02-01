import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Demandez à l'utilisateur ce qu'il y a dans le panier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Créer les listes de noms et de prix
        String[] nomsAccessoires = new String[taillePanier];
        double[] prixHTAccessoires = new double[taillePanier];

        // Demander à l'utilisateur le nom et le prix HT de chaque accessoire de pc
        for (int i = 0; i < taillePanier; i++) {
            System.out.print("Entrez le nom de l'accessoire de pc " + (i + 1) + ": ");
            nomsAccessoires[i] = scanner.next();

            System.out.print("Entrez le prix HT de " + nomsAccessoires[i] + ": ");
            prixHTAccessoires[i] = scanner.nextDouble();
        }

        // Afficher les noms et les prix HT des accessoires avec une boucle
        System.out.println("Liste des accessoires de pc avec leurs prix HT dans le panier :");
        double sommeTotale = 0;
        for (int i = 0; i < taillePanier; i++) {
            String nom = nomsAccessoires[i];
            double prixHT = prixHTAccessoires[i];
            System.out.println("Accessoire de pc: " + nom + ", Prix HT: " + prixHT + " €");
            sommeTotale += prixHT;
        }

        // Afficher la somme totale des achats
        System.out.println("Somme totale des achats : " + sommeTotale + " €");

        // Fermer le scanner
        scanner.close();
    }
}
