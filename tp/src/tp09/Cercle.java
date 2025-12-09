/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

/**
 *
 * @author simon
 */
public class Cercle {
    static double périmètre(double rayon) {
        if(rayon < 0) {
            throw new IllegalArgumentException("Le rayon doit être positif: "+rayon);
        }
        return 2 * Math.PI * rayon;
    }
    
    public static void main(String[] args) {
        System.out.println(périmètre(10));
        System.out.println(périmètre(-3));
    }
}
