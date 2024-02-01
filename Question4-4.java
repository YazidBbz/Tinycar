import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Demander à l'utilisateur la taille du panier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Création les tableaux des noms et des prix
        String[] nomsAccessoires = new String[taillePanier];
        double[] prixHTAccessoires = new double[taillePanier];

        // Demander à l'utilisateur le nom et le prix HT de chaque accessoire de pc
        for (int i = 0; i < taillePanier; i++) {
            System.out.print("Entrez le nom de l'accessoire de pc " + (i + 1) + ": ");
            nomsAccessoires[i] = scanner.next();

            System.out.print("Entrez le prix HT de " + nomsAccessoires[i] + ": ");
            prixHTAccessoires[i] = scanner.nextDouble();
        }

        // Afficher les noms et les prix HT des accessoires de pc avec une boucle
        System.out.println("Liste des accessoires de pc avec leurs prix HT dans le panier :");
        double sommeTotale = 0;
        
        
        double prixMin = prixHTAccessoires[0];  // Conffiguration avec le premier prix
        
        
        double prixMax = prixHTAccessoires[0];  // Conffiguration avec le premier prix

        for (int i = 0; i < taillePanier; i++) {
            String nom = nomsAccessoires[i];
            double prixHT = prixHTAccessoires[i];
            System.out.println("Accessoire de pc: " + nom + ", Prix HT: " + prixHT + " €");

            // Mettre à jour la somme totale
            sommeTotale += prixHT;

            // Chercher le prix minimum
            if (prixHT < prixMin) {
                prixMin = prixHT;
            }

            // Chercher le prix maximum
            if (prixHT > prixMax) {
                prixMax = prixHT;
            }
        }

        // Afficher la somme totale des achats
        System.out.println("Somme totale des achats : " + sommeTotale + " €");

        // Afficher l'accessoire le moins cher
        System.out.println("Accessoire de pc le moins cher : " + getNomParPrix(prixHTAccessoires, prixMin) + ", Prix : " + prixMin + " €");

        // Afficher l'accessoire le plus cher
        System.out.println("Accessoire de pc le plus cher : " + getNomParPrix(prixHTAccessoires, prixMax) + ", Prix : " + prixMax + " €");

        // Calculer et afficher le prix moyen
        double prixMoyen = sommeTotale / taillePanier;
        System.out.println("Prix moyen : " + prixMoyen + " €");

        // Fermer le scanner
        scanner.close();
    }

    // Fonction pour obtenir le nom de l'accessoire correspondant à un certain prix
    private static String getNomParPrix(double[] prix, double targetPrix) {
        for (int i = 0; i < prix.length; i++) {
            if (prix[i] == targetPrix) {
                return "Accessoire de pc" + (i + 1);
            }
        }
        return "Non trouvé";
    }
}

