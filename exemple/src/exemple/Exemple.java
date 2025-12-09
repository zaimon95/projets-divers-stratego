/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import java.lang.reflect.Array;

/**
 *
 * @author simon
 */
public class Exemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tab = {{1, 1}, {2, 2}, {3, 3}};
        for (int i = 0; i < tab.length; i++) {
            int[] is = tab[i];
            System.out.print("{");
            for (int j = 0; j < is.length-1; j++) {
                int k = is[j];
                System.out.print(k + ", ");
            }
            if (is.length > 0) {
                System.out.print(is[is.length - 1]);
            }
            System.out.println("}");
        }
    }
    
}
