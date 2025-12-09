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
public class Exercice10 {
    public static void main(String[] args) {
        int m = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez un montant : "));
        double i = 0.02;
        double m_f = m*(1+i);
        System.out.println("le montant apres intérêts est de " + m_f);
    }
}
