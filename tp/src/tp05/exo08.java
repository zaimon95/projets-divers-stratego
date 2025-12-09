/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class exo08 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = cl.nextLine();
        String min = mot.toLowerCase();
        String voy = "aeiouy";
        int countv = 0;
        int countc = 0;
        for (int i = 0; i < min.length(); i++) {
            for (int j = 0; j < voy.length(); j++) {
                if (min.charAt(i)==voy.charAt(j)) {
                    countv++;
                } 
            }
        }
        countc = min.length()-countv;
        System.out.println("countc = " + countc + "; countv = " + countv);
    }
}
