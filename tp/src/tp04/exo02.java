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
public class exo02 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez la longueur de la ligne : ");
        int l = cl.nextInt();
        int i = 1;
        while(i <= l){
            System.out.print("-");
            i++;
        }
        System.out.println("");
    }
}
