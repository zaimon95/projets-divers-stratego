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
public class exo09 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre d'heures : ");
        int h = cl.nextInt();
        System.out.print("Entrez un nombre de minutes (compris entre 0 et 60) : ");
        int m = cl.nextInt();
        System.out.print("Entrez un nombre de secondes (compris entre 0 et 60) : ");
        int s = cl.nextInt();
        int t = h*3600 + m*60 + s;
        System.out.println("Il y a " + t + " secondes dans " + h + " heures " + m + " minutes " + s + " secondes");
    }
}
