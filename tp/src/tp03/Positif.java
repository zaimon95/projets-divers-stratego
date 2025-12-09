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
public class Positif {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nb = cl.nextInt();
        if(nb>0){
            System.out.println("Le nombre est positif");
        }
        else if(nb<0){
            System.out.println("Le nombre est négatif");
        }
        else{
            System.out.println("Le nombre est nul");
        }
    }
}
