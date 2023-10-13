package comparaison;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedlistGenerat {
    
    private List<Integer> donnees = new LinkedList<>();

    public void genererDonnees() {
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            int nombreAleatoire = rand.nextInt(101);
            donnees.add(nombreAleatoire);
        }
    }

    public List<Integer> getDonnees() {
        return donnees;
    }

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
