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
public class exo07 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre (terminez par -1) : ");
        int val = cl.nextInt();
        int valPrem = val;
        int valDern = 0;
        while(val != -1){
            valDern = val;
            System.out.print("Entrez un nombre (terminez par -1) : ");
            val = cl.nextInt();
        }
        System.out.println("premier : " + valPrem);
        System.out.println("dernier : " + valDern);
    }
}
