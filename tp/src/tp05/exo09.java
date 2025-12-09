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
public class exo09 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);

        System.out.print("Entrez un mot : ");
        String mot = cl.nextLine();
        String min = mot.toLowerCase();

        int l = mot.length();
        boolean estPalindrome = true;
        for (int i = 0; i < l / 2; i++) {
            if (min.charAt(i) != min.charAt(l - i - 1)) {
                estPalindrome = false;
            }
        }
        if(estPalindrome == true){
            System.out.println("Le mot est un palindrome");
        }
        else{
            System.out.println("Le mot n'est pas un palindrome");
        }
    }

}
