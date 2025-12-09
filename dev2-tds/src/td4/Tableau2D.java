/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4;

/**
 *
 * @author g53037
 */
public class Tableau2D {

    /**
     * @param args the command line arguments
     */
    
    
    static void afficher(int[][] tab2D){
        for (int[] is : tab2D) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    static double proportionNuls(int[][] tab2D){
        double count = 0;
        for (int[] lig : tab2D) {
            for (int elem : lig) {
                if(elem == 0)
                    count++;
            }
        }
        return count/(tab2D.length*tab2D[0].length);
    }
     
    static boolean positif(int[][] tab2D){
        boolean pos = true;
        for (int[] lig : tab2D) {
            for (int elem : lig) {
                if(elem <= 0){
                    pos = false;
                    break;
                }
            }
        }
        return pos;
    }
    /*
    vaut mieux faire la vérification de carre magique en plusieurs méthodes
    1 pour calculer la somme de la diagonale principale, 1 pour l'autre diagonale, 
    1 pour les lignes et 1 pour les colonnes.
    Apres, il faut des methodes pour vérifier que les sommes calculées dans les 
    méthodes soient égales
    */
    static boolean carreMagique(int[][] tab2D){
        if(tab2D.length != tab2D[0].length)
            throw new IllegalArgumentException();
        boolean mag = true;
        int sommediag = 0;
        int sommevoulue = 0;
        int sommeAntiDiag = 0;
        int sommeLigne = 0;
        int sommeColonne = 0;
        for (int i = 0; i < tab2D.length; i++) {
            sommediag = sommediag + tab2D[i][i];
            sommeAntiDiag = sommeAntiDiag + tab2D[i][tab2D.length-i-1];
            sommeLigne = 0;
            sommeColonne = 0;
            for (int j = 0; j < tab2D[i].length; j++) {
                sommeLigne = sommeLigne + tab2D[i][j];
                sommeColonne = sommeColonne + tab2D[j][i];
            }
            sommevoulue = sommeLigne;
            if(sommevoulue != sommeColonne){
                mag = false;
            }
        }
        if(sommevoulue != sommeAntiDiag || sommevoulue != sommediag){
            mag = false;
        }
        return mag;
    }
}
