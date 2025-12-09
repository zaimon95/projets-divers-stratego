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
public class exo06 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = cl.nextLine();
        mot.toLowerCase();
        String voy = "aeiouy";
        for(int i = 0; i < mot.length(); i++){
            for(int j = 0; j < voy.length(); j++){
                if(mot.charAt(i) == voy.charAt(j)){
                    System.out.print(mot.charAt(i));
                }
            }
        }
        System.out.println("");
    }
}
