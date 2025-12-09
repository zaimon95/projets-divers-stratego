/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4;

import static td4.Tableau2D.*;

/**
 *
 * @author g53037
 */
public class MainCarreMagique {
    public static void main(String[] args) {
        int[][] tab2D = {{2,7,6}, {9,5,1}, {4,3,8}};
        afficher(tab2D);
        System.out.println(carreMagique(tab2D));
    }
}
