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
public class Exercice07 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez un nombre positif (terminez par -1) : ");
        int nb = clavier.nextInt();
        int nbvaleur = 0;
        int prem = nb;
        int dern = 0;
        while(nb != -1){
            dern = nb;
            System.out.print("Entrez un nombre positif (terminez par -1) : ");
            nb = clavier.nextInt();
        }
        System.out.println("premier = " + prem);
        System.out.println("dernier = " + dern);
    }
}
