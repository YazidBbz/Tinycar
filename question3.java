import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variable qui permet de recommencer ou non le programme
        int i = 0;
        // variable pour le mot de passse
        int l = 0;

        do {
            // demande du mot de passe (entré par l'utilisateur)
            System.out.println("Entrer le mot de passe : ");
            String mdp = sc.nextLine();

            if (mdp.equalsIgnoreCase("padawan")) {
                System.out.println("Bienvenue");
                break;
            } else {
                l++;
            }
        } while (l != 3);

        if (l == 3) {
            System.out.println("Trop de tentative");
            System.exit(0);
        }

        do {

            // marque de la voiture (entré pas l'utilisateur)
            System.out.println("Marque de la voiture ?");
            String marque = sc.nextLine();

            // modèle de la voiture (entré pas l'utilisateur)
            System.out.println("Modèle de la voiture ?");
            String modele = sc.nextLine();

            // valeur du prix HT (entré pas l'utilisateur)
            System.out.println("Prix HT de la voiture ?");
            double prixHT = sc.nextDouble();

            // valeur de la tva
            double tva = 1.02;

            // calcul du prix TTC
            double prixTTC = prixHT * tva;

            // message affiché avec la marque et le modèle
            System.out.println("Marque : " + marque);
            System.out.println("Modèle : " + modele);

            // si prix au dessus de 20 000 : remsie de 10% au prix TTC
            if (prixTTC > 20000) {
                double remiseTTC = prixTTC / 1.1;
                System.out.println("Prix TTC (remsie de 10%) : " + remiseTTC);
            } else {
                System.out.println("Prix TTC : " + prixTTC);
            }

            // demande si l'utilisateur veux recommencer
            System.out.println("Voulez-vous recommencer (0: recommencer / 1: quitter)");
            i = sc.nextInt();
            sc.nextLine(); // vide la ligne si le programme recommence

        } while (i == 0);
    }
}

