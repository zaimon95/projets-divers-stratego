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
public class exo05 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = cl.nextLine();
        for(int i = 0; i < mot.length(); i++){
            char lettre = mot.charAt(mot.length()-i-1);
            System.out.print(lettre);
        }
        System.out.println("");
    }
}
