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
public class AireRectangle {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez la longueur du rectangle : ");
        int longueur = cl.nextInt();
        System.out.print("Entrez la largeur du rectangle : ");
        int largeur = cl.nextInt();
        System.out.print("L'aire du rectangle vaut : ");
        System.out.println(longueur*largeur);
    }
}
