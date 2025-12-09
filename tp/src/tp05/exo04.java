/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class exo04 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = cl.nextLine();
        mot.toLowerCase();
        char prLettre = mot.charAt(0);
        char deLettre = mot.charAt(mot.length()-1);
        if(prLettre == deLettre){
            System.out.println("La première et la dernière lettre sont égales");
        }
        else{
            System.out.println("La première et la dernière lettre ne sont pas égales");
        }
    }
}
