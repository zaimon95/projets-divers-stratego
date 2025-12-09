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
public class Exercice04 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez un texte : ");
        String texte = clavier.nextLine();
        char pl = texte.charAt(0);
        char dl = texte.charAt(texte.length()-1);
        if (pl == dl){
            System.out.println("la première lettre et la derniere lettre sont les memes");
        }
        else{
            System.out.println("la premiere et la derniere lettre ne sont pas les memes");
        }
    }
}
