/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td04;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class Exercice05 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez le nombre de valeurs à entrer : ");
        int nb = clavier.nextInt();
        int somme = 0;
        int nbvaleur = 0;
        while(nbvaleur < nb){
            System.out.print("Entrez un nombre : ");
            int n = clavier.nextInt();
            somme+=n;
            nbvaleur++;
        }
        System.out.println("la somme est de : " + somme);
        System.out.println("la moyenne est de : " + somme/nbvaleur);
    }
}
