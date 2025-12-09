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
public class exo04 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int i = 1;
        while(i <= 10){
            int val = cl.nextInt();
            if(val%2 == 0){
                System.out.println("pair");
            }
            else{
                System.out.println("impair");
            }
            i++;
        }
    }
}
