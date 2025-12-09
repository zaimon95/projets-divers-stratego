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
public class Resolutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] solutions = resolve3eDegre(1, 1, 1);
        System.out.println("x1 = " + solutions[0]);
        System.out.println("x2 = " + solutions[1]);
    }
    
    public static double[] resolve3eDegre(int a, int b, int c){
        double rho = Math.pow(b, 2) - 4*a*c;
        double x1;
        double x2;
        if(rho > 0){
            x1 = (-b + Math.sqrt(rho))/(2*a);
            x2 = (-b - Math.sqrt(rho))/(2*a);            
        }
        else if(rho == 0){
            x1 = -b/(2*a);
            x2 = x1;
        }
        else{
            x1 = Double.NaN;
            x2 = x1;
        }
        return new double[] {x1, x2};
    }
    
}
