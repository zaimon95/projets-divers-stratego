/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;
import java.util.Scanner;
/**
 *
 * @author simon
 */
public class exo10 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un montant : ");
        double m = cl.nextDouble();
        double i = 0.02;
        double total = m*i;
        System.out.println("Après 1 an et avec un taux d'intérêt de 2%, vous aurez gagné " + total + " € sur votre compte");
    }
}
