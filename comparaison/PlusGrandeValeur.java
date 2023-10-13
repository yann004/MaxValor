package comparaison;

import java.util.List;
import java.util.Scanner;

/**
 * La classe PlusGrandeValeur est le point d'entrée du programme. Elle permet à l'utilisateur de choisir
 * entre une ArrayList et une LinkedList pour stocker les données, génère des valeurs aléatoires,
 * affiche ces valeurs, et détermine la plus grande valeur ainsi que son index.
 */
public class PlusGrandeValeur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez le type de structure de données :");
        System.out.println("1. Utiliser un tableau (ArrayList)");
        System.out.println("2. Utiliser une liste chaînée (LinkedList)");

        int choix = scanner.nextInt();

        List<Integer> donnees;

        if (choix == 1) {
            ArraylistGenerat donneesArrayList = new ArraylistGenerat();
            donneesArrayList.genererDonnees();
            donnees = donneesArrayList.getDonnees();
        } else if (choix == 2) {
            LinkedlistGenerat donneesLinkedList = new LinkedlistGenerat();
            donneesLinkedList.genererDonnees();
            donnees = donneesLinkedList.getDonnees();
        } else {
            System.out.println("Choix invalide. Utilisation d'un tableau par défaut.");
            ArraylistGenerat donneesArrayList = new ArraylistGenerat();
            donneesArrayList.genererDonnees();
            donnees = donneesArrayList.getDonnees();
        }

        System.out.println("Valeurs de la structure de données : " + donnees);

        int maxValeur = Integer.MIN_VALUE;
        int indexMax = -1;

        for (int i = 0; i < donnees.size(); i++) {
            int valeur = donnees.get(i);
            if (valeur > maxValeur) {
                maxValeur = valeur;
                indexMax = i;
            }
        }

        System.out.println("La plus grande valeur est " + maxValeur + " à l'index " + indexMax);

        scanner.close();
    }
}
