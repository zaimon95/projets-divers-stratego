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
public class exo03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez la longueur du côté d'un carré : ");
        int c = cl.nextInt();
        System.out.print("L'aire du carré vaut : ");
        System.out.println(c*c);
    }
}
