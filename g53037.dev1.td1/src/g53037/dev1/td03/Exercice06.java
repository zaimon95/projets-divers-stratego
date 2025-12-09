/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td03;
import java.util.*;
/**
 *
 * @author simon
 */
public class Exercice06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un 1e nombre : ");
        double nb1 = clavier.nextDouble();
        System.out.print("Entrez un 2e nombre : ");
        double nb2 = clavier.nextDouble();
        System.out.print("Entrez un 3e nombre : ");
        double nb3 = clavier.nextDouble();
        System.out.print("Le plus grand nombre est ");
        if(nb1 > nb2 && nb1 > nb3){
            System.out.println(nb1);
        }
        else if(nb2 > nb3){
            System.out.println(nb2);
        }
        else{
            System.out.println(nb3);
        }
    }
}
