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
public class Exercice09 {
    public static void main(String[] args) {
        int h = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez un nombre d'heures : "));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez un nombre de minutes : "));
        int s = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez un nombre de secondes : "));
        int t = h*3600 + m*60 + s;
        System.out.println("le nombre total de secondes est : " + t);
    }
}
