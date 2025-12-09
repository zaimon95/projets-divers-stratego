/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;
import java.util.Scanner;
/**
 *
 * @author simon
 */
public class exo01 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez votre âge : ");
        int age = cl.nextInt();
        if(age>=18){
            System.out.println("Vous êtes majeur!");
        }
    }
}
