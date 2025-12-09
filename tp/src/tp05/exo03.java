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
public class exo03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = cl.nextLine();
        mot.toLowerCase();
        char prLettre = mot.charAt(0);
        boolean voyel = false;
        String voy = "aeiouy";
        for(int i = 0; i < voy.length(); i++){
            if(prLettre == voy.charAt(i)){
                voyel = true;
            }
        }
        if(voyel == false){
            System.out.println("La première lettre est une consonne");
        }
    }
}
