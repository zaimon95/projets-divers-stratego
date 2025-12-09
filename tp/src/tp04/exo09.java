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
public class exo09 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez le nombre de valeurs à introduire : ");
        int nbmax = cl.nextInt();
        System.out.print("Entrez un nombre : ");
        int val = cl.nextInt();
        int max = val;
        int min = val;
        int nb = 0;
        while(nb < nbmax){
            System.out.print("Entrez un nombre : ");
            val = cl.nextInt();
            if(val > max){
                max = val;
            }
            if(val < min){
                min = val;
            }
            nb++;
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
