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
public class Exercice02 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez un texte : ");
        String texte = clavier.nextLine();
        char pl = texte.charAt(0);
        String voyelle = "aeiouyAEIOUY";
        for(int i = 0; i < voyelle.length(); i++){
            if (pl == voyelle.charAt(i)){
                System.out.println("la première lettre est une voyelle");
            }
        }
    }
}
