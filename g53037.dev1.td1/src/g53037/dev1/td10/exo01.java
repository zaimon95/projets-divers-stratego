/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td10;

/**
 *
 * @author simon
 */
public class exo01 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("taille: " + tab.length);
        System.out.println("1e element: " + tab[0]);
        System.out.println("dernier élément: "  + tab[tab.length-1]);
        System.out.println("autre élément: " + tab[2]);
        System.out.println("affiche un drôle de truc: " + tab);
        
        afficherTab(tab);
        incrementer(tab);
        afficherTab(tab);
        multiplier(tab, 7);
        
        int[] tab2 = new int[10];
        afficherTab(tab2);
    }
    static void afficherTab(int[] tab){
        System.out.print("[");
        for(int valeur : tab){
            System.out.print(valeur + ", ");
        }
        System.out.println("]");
    }
    static void incrementer(int[] tab){
        for(int i = 0; i < tab.length; i++){
            tab[i]++;
        }
    }
    static void multiplier(int[] tab, int mult){
        for(int valeur : tab){
            valeur = valeur*mult;
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}
