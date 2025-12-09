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
public class exo05 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre entier a : ");
        int a = cl.nextInt();
        System.out.print("Entrez un nombre entier b : ");
        int b = cl.nextInt();
        System.out.print("Entrez un nombre entier c : ");
        int c = cl.nextInt();
        System.out.print("a % 2 == 0 : ");
        System.out.println(a%2==0);
        System.out.print("a % 2 == 1 : ");
        System.out.println(a%2==1);
        System.out.print("a % b == 0 : ");
        System.out.println(a%b==0);
        System.out.print("a < b : ");
        System.out.println(a<b);
        System.out.print("a <= b && a <= c (a est le minimum) : ");
        System.out.println(a<=b && a<=c);
        System.out.print("(a < b && b < c) || (a > b && b > c) (b est compris entre a et c) : ");
        System.out.println((a<b && b<c) || (a>b && b>c));
    }
}
