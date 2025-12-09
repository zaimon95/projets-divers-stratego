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
public class Exercice06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez le nombre de valeurs à entrer : ");
        int nb = clavier.nextInt();
        int nbvaleur = 0;
        int pos = 0;
        int neg = 0;
        int nul = 0;
        while(nbvaleur < nb){
            System.out.print("Entrez un nombre : ");
            int n = clavier.nextInt();
            if(n>0){
                pos++;
            }
            else if(n<0){
                neg++;
            }
            else{
                nul++;
            }
            nbvaleur++;
        }
        System.out.println("positifs : " + pos);
        System.out.println("négatifs : " + neg);
        System.out.println("nuls : " + nul);
    }
}
