/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td03;
import java.util.*;
/**
 *
 * @author simon
 */
public class Exercice07 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la longueur du 1e coté : ");
        double a = clavier.nextDouble();
        System.out.print("Entrez la longueur du 2e côté : ");
        double b = clavier.nextDouble();
        System.out.print("Entrez la longueur du 3e côté : ");
        double c = clavier.nextDouble();
        if(a == b && a == c){
            System.out.println("le triangle est équilatéral");
        }
        else if(a == b || a == c || b == c){
            System.out.println("le triangle est isocèle");
        }
        else{
            System.out.println("le triangle est quelconque");
        }
    }
}
