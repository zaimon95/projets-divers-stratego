/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td03;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author simon
 */
public class Exercice03 {
    public static void main(String[] args) {
        double nb1 = Double.parseDouble(JOptionPane.showInputDialog(null,"entrez un nombre : "));
        double nb2 = Double.parseDouble(JOptionPane.showInputDialog(null,"entrez un 2e nombre : "));
        System.out.print("le plus grand nombre est : ");
        if(nb1>=nb2){
            System.out.println(nb1);
        }
        else{
            System.out.println(nb2);
        }
    }
}
