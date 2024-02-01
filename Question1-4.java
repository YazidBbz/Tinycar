public class Question1 {
    public static void main(String[] args) {
        // Le tableau des d'un pc
        String[] nomsPc = {"Carte_graphique", "Ssd", "Carte_mere", "Msi"};

        // Le tableau des prix ht d'un pc
        double[] prixHTPc = {10.99, 24.99, 8.50, 15.00};

        // Les noms et les prix HT d'un pc avec une boucle
        for (int i = 0; i < nomsPc.length; i++) {
            String nom = nomsPc[i];
            double prixHT = prixHTPc[i];
            System.out.println("PC: " + nom + ", Prix HT: " + prixHT + " €");
        }
    }
}
