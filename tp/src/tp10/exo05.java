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
public class exo05 {

    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        afficherTab(tableau);
        int[] copie1 = copie(tableau);
        int[] copie2 = pasUneCopie(tableau);
        tableau[0] = 9;
        System.out.print("tableau: ");
        afficherTab(tableau);
        System.out.print("copie1: ");
        afficherTab(copie1);
        System.out.print("copie2: ");
        afficherTab(copie2);
        System.out.print("miroir: ");
        int[] miroir = miroir(tableau);
        afficherTab(miroir);

    }

    /**
     * Retourne une copie d'un tableau d'entiers.
     * <p>
     * @param tab le tableau à copier.
     * <p>
     * @return une copie du tableau donné en paramètre.
     */
    static int[] copie(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }

    /**
     * Retourne le tableau d'entiers passé en paramètre. Aucune modification
     * n'est effectuée dans le tableau.
     * <p>
     * @param tab le tableau à retourner.
     * <p>
     * @return le tableau d'entiers passé en paramètre.
     */
    static int[] pasUneCopie(int[] tab) {
        int[] copie = tab;
        return copie;
    }

    /**
     * Affiche un tableau d'entiers.
     * <p>
     * @param tab le tableau à afficher
     */
    static void afficherTab(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static int[] miroir(int[] tab) {
        int[] j = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            j[tab.length - i - 1] = tab[i];

        }
        return j;
    }
}
