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
public class exo08 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        System.out.print("Entrez un nombre (terminez par -1) : ");
        int val = cl.nextInt();
        int max = val;
        while(val != -1){
            System.out.print("Entrez un nombre (terminez par -1) : ");
            val = cl.nextInt();
            if(val > max){
                max = val;
            }
        }
        System.out.println("max : " + max);
    }
}
