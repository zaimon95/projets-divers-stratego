/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td08;
import java.util.*;
/**
 *
 * @author simon
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println(saisieEntier("vas-y : ", 0, 10));
    }
    static int saisieEntier(String message){
        Scanner cl = new Scanner(System.in);
        System.out.print(message);
        while(!cl.hasNextInt()){
            cl.next();
            System.out.println("le nombre n'est pas entier");
            System.out.print(message);
        }
        return cl.nextInt();
    }
    static int saisieEntier(String message, int min, int max){
        int a = saisieEntier("vas-y : ");
        while(a > max || a < min){
            System.out.println("l'entrée donnée n'est pas un entier compris entre " + min + " et " + max);
            a = saisieEntier("vas-y : ");
        }
        return a;
    }
}
