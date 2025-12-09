/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_cartes;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author simon
 */
public class JeuDeCarte {
    public static void main(String[] args) {
        //afficherTab(carte());
        afficherTab(rnd(carte()));
        //comparer();
    }
    public static String[] carte(){
        String[] carte = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
        String couleur[] = {"Coeur", "Carreau", "Trefle", "Pique"};
        //String c_finale = "on tire la carte : " + carte[a] + " de " + couleur[b];
        String[] paq = new String[52];
        for (int i = 0; i <= couleur.length - 1; i++) {
            switch (i){
                case 0:
                    for (int j = 0; j <= carte.length - 1; j++) {
                        paq[j] = carte[j] + " de " + couleur[i];
                    }
                    break;
                case 1:
                    for (int j = 0; j <= carte.length - 1; j++) {
                        paq[j + 13] = carte[j] + " de " + couleur[i];
                    }
                    break;
                case 2:
                    for (int j = 0; j <= carte.length - 1; j++) {
                        paq[j + 26] = carte[j] + " de " + couleur[i];
                    }
                    break;
                case 3:
                    for (int j = 0; j <= carte.length - 1; j++) {
                        paq[j + 39] = carte[j] + " de " + couleur[i];
                    }
                    break;
            }
        }
        
        return paq;
    }
    
    static String[] rnd(String[] paq){
        Random rnd = new Random();
        for (int i = paq.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = paq[index];
            paq[index] = paq[i];
            paq[i] = a;
        }
        return paq;
    }
    
    static void afficherTab(String[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");
        }
        if (tab.length > 0) {
            System.out.print(tab[tab.length - 1]);
        }
        System.out.println("]"); // on passe à la ligne
    }
    public static void comparer(){

        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez 1 pour rejouer et -1 pour arreter :  ");
        int retry = clavier.nextInt();
        int scoreJ1 = 0;
        int scoreJ2 = 0;
        while(retry != -1){
            String[] carte = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
            String couleur[] = {"Coeur", "Carreau", "Trefle", "Pique"};
            int a = (int)(Math.random()*13);
            int b = (int)(Math.random()*13);
            int c = (int)(Math.random()*4);
            int d = (int)(Math.random()*4);
            String c_finale1 = "on tire comme carte 1 : " + carte[a] + " de " + couleur[c];
            String c_finale2 = "on tire comme carte 2 : " + carte[b] + " de " + couleur[d];
            System.out.println(c_finale1);
            System.out.println(c_finale2);
            if(a > b){
                scoreJ1++;
                System.out.println("le joueur 1 gagne");
            }
            else if(b > a){
                scoreJ2++;
                System.out.println("le joueur 2 gagne");
            }
            else{
                System.out.println("c'est égalité");
            }
            System.out.println("le score est de : J1 : " + scoreJ1 + " J2 : " + scoreJ2);
            System.out.print("entrez 1 pour rejouer et -1 pour arreter :  ");
            retry = clavier.nextInt();
        }
    }
}
