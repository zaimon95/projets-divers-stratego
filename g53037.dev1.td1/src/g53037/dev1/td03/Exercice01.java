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
public class Exercice01 {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"entrez votre age : "));
        if(age>=18){
            System.out.println("vous êtes majeur");
        }
        else{
            System.out.println("vous êtes mineur");
        }
    }
}
