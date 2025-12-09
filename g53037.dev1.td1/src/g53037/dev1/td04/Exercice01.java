/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td04;
import java.util.*;
/**
 *
 * @author simon
 */
public class Exercice01 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = clavier.nextInt();
        int i = 1;
        System.out.println("les nombres de 1 à " + n + " sont : ");
        while(i <= n){
            System.out.println(i);
            i++;
        }
        i = 2;
        System.out.println("les nombres pairs de 1 à " + n + " sont : ");
        while(i <= n){
            System.out.println(i);
            i+=2;
        }
        i = -n;
        System.out.println("les nombres de -" + n +" à " + n + " sont : ");
        while(i <= n){
            System.out.println(i);
            i++;
        }
        i = 5;
        System.out.println("les nombres multiples de 5 et compris entre 1 et " + n + " sont : ");
        while(i <= n){
            System.out.println(i);
            i+=5;
        }
        i = n;
        System.out.println("les nombres multiples de " + n + "compris entre 1 et 100 sont : ");
        while(i <= 100){
            System.out.println(i);
            i+=n;
        }
    }
}
