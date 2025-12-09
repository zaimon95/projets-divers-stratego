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
public class Exercice11 {
    public static void main(String[] args) {
        int pu = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez le prix unitaire : "));
        double tva = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez la TVA en % : "));
        int q = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez la quantité : "));
        tva = tva/100;
        double pt = q*pu*(1+tva);
        System.out.println(pt);
    }
}
