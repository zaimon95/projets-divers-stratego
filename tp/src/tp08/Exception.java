/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp08;
import java.util.*;
/**
 *
 * @author simon
 */
public class Exception {
    public static void main(String[] args) {
        
    }
    public static double diviser(double dividende, double diviseur) throws IllegalArgumentException{
        if(diviseur == 0){
            throw new IllegalArgumentException("division par 0 interdite");
        }
        double quotient = dividende / diviseur;
        return quotient;
    }
}
