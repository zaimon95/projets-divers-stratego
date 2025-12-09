/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;
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
        int i = 1;
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        i = 1;
        while(i <= n){
            if(i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("");
        i = -n;
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        i = 1;
        while(i <= n){
            if(i%5==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("");
        i = 1;
        while(i <= 100){
            if(i%n==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("");
    }
    
}
