/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06;

/**
 *
 * @author simon
 */
public class MathUtil {
    public static void main(String[] args) {
        /*System.out.println("périmètre de 10 : " + périmètreCercle(10));
        System.out.println("aire de 10 : " + aireCercle(10));
        System.out.println(min2(4.87, 3.92));
        System.out.println(min3(2.973, 3.3862, 3.273));
        System.out.println(moyenne(10.5, 15.5));
        System.out.println(estDivisible(19,5));
        System.out.println(abs(0));*/
        System.out.println(unité(123));
        System.out.println(dizaine(123));
        System.out.println(centaine(123));
        System.out.println(mirroir(123));
        
    }
    static double périmètreCercle(double r){
        return 2*Math.PI*r;
    }
    static double aireCercle(double r){
        return Math.PI*r*r;
    }
    static double min2(double x, double y){
        double min = x;
        if(x > y){
            min = y;
        }
        return min;
    }
    static double min3(double x, double y, double z){
        double min = min2(x, y);
        min = min2(min, z);
        return min;
    }
    static double moyenne(double x, double y){
        return (x+y)/2;
    }
    static boolean estDivisible(int a, int b){
        return a%b == 0;
    }
    static int abs(int a){
        if(a >= 0){
            a = a;
        }
        else{
            a = -a;
        }
        return a;
    }
    static int unité(int a){
        return a%10;
    }
    static int dizaine(int a){
        return (a/10)%10;
    }
    static int centaine(int a){
        return (a/100)%10;
    }
    static int mirroir(int a){
        return (centaine(a) + dizaine(a)*10 + unité(a)*100);
    }
}
