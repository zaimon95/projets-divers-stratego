/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

/**
 *
 * @author simon
 */
public class exo03 {
    /**
     * 
     * @param args 
     * prints a pyramid of stars
     */
    public static void main(String[] args) {
        for(int i = 1; i < 5; i++){
            for(int j = 5 - i; j > 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
