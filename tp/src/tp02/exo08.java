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
public class exo08 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre de secondes : ");
        int sec = cl.nextInt();
        int min = sec / 60;
        System.out.println("Il y a " + min + " minutes dans " + sec + " secondes");
    }
}
