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
public class exo07 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre nb entre 100 et 999 : ");
        int nb = cl.nextInt();
        int u = nb%10;
        int d = (nb/10)%10;
        int c = (nb/100)%10;
        int nw_nb = 100*u + 10*d + c;
        System.out.println("le mirroir de " + nb + " est : " + nw_nb);
    }
}
