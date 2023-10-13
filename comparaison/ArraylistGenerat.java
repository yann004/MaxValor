
package comparaison;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * La classe ArraylistGenerat gère un tableau de données utilisant une ArrayList.
 * Elle génère des valeurs aléatoires, stocke ces valeurs et trouve la plus grande valeur.
 */

public class ArraylistGenerat {

    private List<Integer> donnees = new ArrayList<>();

/**
 * Génère des valeurs aléatoires et les ajoute à la liste.
 */

    public void genererDonnees() {
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            int nombreAleatoire = rand.nextInt(101);
            donnees.add(nombreAleatoire);
        }
    }
    
    /**
     * Récupère la liste de données.
     *
     * @return La liste de données.
     */
    public List<Integer> getDonnees() {
        return donnees;
    }
    
    /**
     * Trouve la plus grande valeur dans la liste de données.
     *
     * @return La plus grande valeur.
     */

    public int trouverMaxValeur() {
        int maxValeur = Integer.MIN_VALUE;
        for (int valeur : donnees) {
            if (valeur > maxValeur) {
                maxValeur = valeur;
            }
        }
        return maxValeur;
    }
}
