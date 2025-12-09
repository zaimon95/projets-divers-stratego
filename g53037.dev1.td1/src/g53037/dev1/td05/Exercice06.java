/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td05;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class Exercice06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez un texte : ");
        String texte = clavier.nextLine();
        char lettre = texte.charAt(0);
        String voy = "aeiouyAEIOUY";
        for(int i = 0; i < texte.length(); i++){
            switch(texte.charAt(i)){
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                    System.out.print(texte.charAt(i));
                    break;
                default:
            }
        }
        System.out.println("");
    }
}
