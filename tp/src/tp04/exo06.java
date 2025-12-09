/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class exo06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez le nombre de valeurs à entrer : ");
        int nbmax = clavier.nextInt();
        int nb = 0;
        int pos = 0;
        int neg = 0;
        int nul = 0;
        while(nb < nbmax){
            System.out.print("Entrez un nombre : ");
            int val = clavier.nextInt();
            if(val>0){
                pos++;
            }
            else if(val<0){
                neg++;
            }
            else{
                nul++;
            }
            nb++;
        }
        System.out.println("positifs : " + pos);
        System.out.println("négatifs : " + neg);
        System.out.println("nuls : " + nul);
    }
}
