/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td03;

import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class Exercice02 {
    public static void main(String[] args) {
        int nb = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez un nombre : "));
        if(nb%2 == 0){
            System.out.println("ce nombre est pair");
        }
        else{
            System.out.println("ce nombre est impair");
        }
    }
}
