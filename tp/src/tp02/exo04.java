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
public class exo04 {
    public static void main(String[] args) {
        double pi = 3.141593;
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez le rayon d'un cercle : ");
        double r = cl.nextDouble();
        System.out.print("Le perimètre du cerle vaut : ");
        System.out.println(2*pi*r);
        System.out.print("L'aire du cercle vaut : ");
        System.out.println(pi*r*r);
    }
}
