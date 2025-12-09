/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentacademy;

/**
 *
 * @author simon
 */
public class deterPi {
    public static void main(String[] args) {
        System.out.println(deter());
        //System.out.println(pi1);
        //System.out.println(pi2);
        //System.out.println(pi);
    }
    public static double deter(){
        double pi1 = 0.0;
        double pi2 = 0.0;
        double pi = 0.0;
        double div1 = 0.0;
        double  div2 = 0.0;
        for(double i = 0; i < 1000000000; i++){
            div1 = (1/(4*i+1));
            div2 = (1/(4*i+3));
            pi1 = pi1 + div1;
            pi2 = pi2 + div2;
        }
        pi = 4*(pi1 - pi2);
        return pi;
    }
}
