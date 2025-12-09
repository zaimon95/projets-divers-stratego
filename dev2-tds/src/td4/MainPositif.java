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
public class MainPositif {
    public static void main(String[] args) {
        int[][] tab2D = {{1,-1,1}, {2,2,2}, {3,3,3}};
        afficher(tab2D);
        System.out.println(positif(tab2D));
    }
}
