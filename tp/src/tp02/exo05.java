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
public class exo05 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez le nombre a : ");
        int a = cl.nextInt();
        System.out.print("Entrez le nombre b : ");
        int b = cl.nextInt();
        System.out.print("a + b = ");
        System.out.println(a+b);
        System.out.print("a - b = ");
        System.out.println(a-b);
        System.out.print("a * b = ");
        System.out.println(a*b);
        System.out.print("a / b = ");
        System.out.println(a/b);
        System.out.print("a % b = ");
        System.out.println(a%b);
        System.out.print("a * a + b * b = ");
        System.out.println(a*a+b*b);
    }
}
