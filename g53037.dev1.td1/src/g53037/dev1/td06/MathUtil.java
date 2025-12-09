/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td06;

/**
 *
 * @author simon
 */
public class MathUtil {
    public static void main(String[] args) {
        //System.out.println(périmètreCercle(5));
        //System.out.println(aireCercle(5));
        System.out.println(min2(10,6));
        System.out.println(min3(10,6,19));
        System.out.println(moyenne(10.5,15.5));
        System.out.println(estDivisible(4, 3));
        
    }
    public static double périmètreCercle(double r){
        return 2*Math.PI*r;
    }
    public static double aireCercle(double r){
        return Math.PI*r*r;
    }
    public static double min2(double a, double b) {
        double min = a;
        if(a > b) {
            min = b;
        }
        return min;
    }
    public static double min3(double a, double b, double c) {
        double min = min2(a, b);
        min = min2(min, c);
        return min;
    }
    public static double moyenne(double a, double b){
        return (a+b)/2;
    }
    public static boolean estDivisible(int a, int b){
        if(a%b == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
