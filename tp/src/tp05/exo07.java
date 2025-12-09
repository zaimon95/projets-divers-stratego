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
public class exo07 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String mot = cl.nextLine();
        boolean isSentence = false;
        String point = ".";
        if(Character.isUpperCase(mot.charAt(0)) && mot.endsWith(point)){
            isSentence = true;
        }
        if (isSentence==true) {
            System.out.println("C'est une phrase");
        }
        else {
            System.out.println("C'est pas une phrase");
        }
    }
}
