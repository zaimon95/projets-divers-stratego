/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;
import java.util.Scanner;
/**
 *
 * @author simon
 */
public class exo07 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez la longueur du 1e côté d'un triangle : ");
        double a = cl.nextDouble();
        System.out.print("Entrez la longueur du 2e côté d'un triangle : ");
        double b = cl.nextDouble();
        System.out.print("Entrez la longueur du 3e côté d'un triangle : ");
        double c = cl.nextDouble();
        if(a == b && b == c){
            System.out.println("Le triangle est équilatéral");
        }
        else if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
            System.out.println("Le triangle est isocèle");
        }
        else{
            System.out.println("Le triangle est quelconque");
        }
    }
}
