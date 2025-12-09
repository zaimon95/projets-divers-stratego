/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class exo01 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez une valeur : ");
        int n = cl.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        for(int i = 1; i <= n; i++){
            
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        
        for(int i = -n; i <= n; i++){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        for(int i = 1; i <= n; i++){
            
            if(i%5==0){
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        
        for(int i = 1; i <= 100; i++){
            
            if(i%n==0){
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
    }
}
