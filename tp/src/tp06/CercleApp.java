/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06;
import java.util.Scanner;
/**
 *
 * @author simon
 */
public class CercleApp {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez le rayon d'un cercle : ");
        int r = cl.nextInt();
        System.out.println("périmètre de r : " + MathUtil.périmètreCercle(r));
        System.out.println("aire de r : " + MathUtil.aireCercle(r));
    }
}
