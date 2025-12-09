/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td06;
import java.util.*;
/**
 *
 * @author simon
 */
public class CercleApp {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("entrez le rayon d'un cercle : ");
        int r = cl.nextInt();
        System.out.println(MathUtil.périmètreCercle(r));
        System.out.println(MathUtil.aireCercle(r));
        
    }
}
