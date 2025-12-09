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
public class exo06 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre nb entre 0 et 999 : ");
        int nb = cl.nextInt();
        int u = nb%10;
        int d = (nb/10)%10;
        int c = (nb/100)%10;
        System.out.println(u);
        System.out.println(d);
        System.out.println(c);
    }
}
