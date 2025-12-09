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
public class exo11 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre (terminez par -1) : ");
        int val = cl.nextInt();
        int valPrec = val;
        boolean cr = true;
        while(val != -1){
            if(val < valPrec){
                cr = false;
            }
            valPrec = val;
            System.out.print("Entrez un nombre (terminez par -1) : ");
            val = cl.nextInt();
            
        }
        if(cr == true){
            System.out.println("Cette série est croissante");
        }
        else{
            System.out.println("Cette série est décroissante");
        }
    }
}
