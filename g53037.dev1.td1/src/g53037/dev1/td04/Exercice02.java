/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td04;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class Exercice02 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nombre de tirets que vous voulez : ");
        int n = clavier.nextInt();
        int i = 1;
        while(i <= n){
            System.out.print("-");
            i++;
        }
    }
}
