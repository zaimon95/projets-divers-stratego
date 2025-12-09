/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simon
 */
public class exo01Test {
    
    /**
     * Test of incrémenter method, of class exo01.
     */
    @Test
    public void testIncrémenter() {
        int[] tab = {1, 2, 3};
        exo01.incrémenter(tab);
        int[] tabAttendu = {2, 3, 4};
        assertArrayEquals(tabAttendu, tab);
    }
    @Test
    public void testIncrémenterTableauVide(){
        int[] tab = {};
        exo01.incrémenter(tab);
        int[] tabAttendu = {};
        assertArrayEquals(tabAttendu, tab);
    }
    
    @Test(expected=NullPointerException.class)
    public void testIncrémenterTableauNull(){
        int[] tab = null;
        exo01.incrémenter(tab);
        int[] tabAttendu = null;
        assertArrayEquals(tabAttendu, tab);
    }

    /**
     * Test of multiplier method, of class exo01.
     */
    @Test(expected = NullPointerException.class)
    public void testMultiplierNull() {
        System.out.println("multiplier tableau null");
        int[] tab = null;
        int valeur = 0;
        exo01.multiplier(tab, valeur);
        int[] tabAttendu = null;
        assertArrayEquals(tab, tabAttendu);
    }
    @Test
    public void testMultiplierpositif() {
        System.out.println("multiplier tableau par un nombre positif");
        int[] tab = {-1, 2, -3, 4};
        int valeur = 3;
        exo01.multiplier(tab, valeur);
        int[] tabAttendu = {-3, 6, -9, 12};
        assertArrayEquals(tab, tabAttendu);
    }
    @Test
    public void testMultiplierNégatif() {
        System.out.println("multiplier tableau par un nombre négatif");
        int[] tab = {-1, 2, -3, 4};
        int valeur = -2;
        exo01.multiplier(tab, valeur);
        int[] tabAttendu = {2, -4, 6, -8};
        assertArrayEquals(tab, tabAttendu);
    }
    @Test
    public void testMultiplierVide() {
        System.out.println("multiplier tableau vide");
        int[] tab = {};
        int valeur = -2;
        exo01.multiplier(tab, valeur);
        int[] tabAttendu = {};
        assertArrayEquals(tab, tabAttendu);
    }
}
