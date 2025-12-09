/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10;

/**
 *
 * @author simon
 */
public class exo03 {
    public static void main(String[] args) {
        String[] mots = {"the", "quick", "brown", "fox", "jumps", "over", "the",
                         "lazy", "dog"};

        for (String mot : mots) { // pour chaque mot dans le tableau 'mots'
            System.out.print(mot + " "); // affiche le mot suivi d'un espace.
        }
        System.out.println(); // passe à la ligne.
        afficheTableau(mots); // la même chose mais dans une méthode.

        afficherTailles(mots);
        String plusLongMot = plusLongMot(mots);
        System.out.println("Un des mots le plus longs est " + plusLongMot);

    }

    /**
     * Affiche un tableau de chaînes de caractères.
     * <p>
     * @param mots le tableau à afficher.
     */
    static void afficheTableau(String[] mots) {
        for (String mot : mots) {
            System.out.print(mot + " ");
        }
        System.out.println();
    }
    static void afficherTailles(String[] mots){
        for (String mot : mots) {
            System.out.print(mot.length() + " ");
        }
        System.out.println("");
    }
    static String plusLongMot(String[] mots){
        String motLong = mots[0];
        for (String mot : mots) {
            if(mot.length() > motLong.length()){
                motLong = mot;
            }
        }
        return motLong;
    }
}
