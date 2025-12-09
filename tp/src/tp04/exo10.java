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
public class exo10 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre (terminez par -1) : ");
        int val = cl.nextInt();
        int valPrem = val;
        int valDern = val;
        while(val != -1){
            valDern = val;
            System.out.print("Entrez un nombre (terminez par -1) : ");
            val = cl.nextInt();
        }
        if(valPrem == -1){
            System.out.println("La série est vide");
        }
        else if(valPrem > valDern){
            System.out.println("Le premier est supérieur au dernier");
        }
        else if(valPrem == valDern){
            System.out.println("Le premier est égal au dernier");
        }
        else if(valPrem < valDern){
            System.out.println("Le premier est inférieur au dernier");
        }
    }
}
