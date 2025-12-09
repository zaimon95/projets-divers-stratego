/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10;

/**
 *
 * @author simon
 */
public class TestInit {
    public static void main(String[] args) {
        int[] tab = new int[10];
        afficherTab(tab);
        double [] tabd = new double[10];
        afficherTab(tabd);
        boolean [] tabb = new boolean[10];
        afficherTab(tabb);
        String [] tabs = new String[10];
        afficherTab(tabs);
    }
    static void afficherTab(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void afficherTab(double [] tab) {
        for (double element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void afficherTab(boolean [] tab) {
        for (boolean element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void afficherTab(String[] tab) {
        for (String element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
