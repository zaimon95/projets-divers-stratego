/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td02;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class Exercice08 {
    public static void main(String[] args) {
        int sec = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez un nombre de secondes : "));
        int min = sec/60;
        System.out.println("il y a " + min + " minutes dans " + sec + " secondes");
    }
}
