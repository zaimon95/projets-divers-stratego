/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class exo11 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez le prix unitaire hors TVA : ");
        double pu = cl.nextDouble();
        System.out.print("Entrez le taux de TVA (en % donc un entier) : ");
        int tva = cl.nextInt();
        System.out.print("Entrez la quantité de produits achetés : ");
        int q = cl.nextInt();
        double pt = q*pu*(1+(tva/100.0));
        System.out.println("la prix que tu devra payer est de : " + ((int)(pt*100))/100. + " €");
    }
}
