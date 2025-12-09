/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td02;
import javax.swing.*;
/**
 *
 * @author simon
 */
public class Exercice07 {
    public static void main(String[] args) {
        int nb = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez un nombre à 3 chiffres : "));
        int u = nb%10;
        int d = (nb/10)%10;
        int c = (nb/100)%10;
        int nb_m = c + 10*d + 100*u;
        System.out.println("le nombre mirroir est : " + nb_m);
    }
}
