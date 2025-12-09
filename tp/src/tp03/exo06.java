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
public class exo06 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre réel a : ");
        double a = cl.nextDouble();
        System.out.print("Entrez un nombre réel b : ");
        double b = cl.nextDouble();
        System.out.print("Entrez un nombre réel c : ");
        double c = cl.nextDouble();
        if(a >= b && a >= c){
            System.out.println("Le maximum est : " + a);
        }
        else if(b >= c){
            System.out.println("Le maximum est : " + b);
        }
        else{
            System.out.println("Le maximum est : " + c);
        }
    }
}
