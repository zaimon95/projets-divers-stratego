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
public class exo05 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int somme = 0;
        int nb = 0;
        System.out.print("Combien de valeurs voulez-vous introduire ? ");
        int nbmax = cl.nextInt();
        while(nb<nbmax){
            int val = cl.nextInt();
            somme += val;
            nb++;
        }
        int moy = somme/nb;
        System.out.println("somme = " + somme);
        System.out.println("moyenne = " + moy);
    }
}
