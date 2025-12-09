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
public class exo05Test {
    
    /**
     * Test of copie method, of class exo05.
     */
    @Test
    public void testCopie() {
        System.out.println("copie");
        int[] tab = {1, 2, 3, 4};
        int[] expResult = {1, 2, 3, 4};
        int[] result = exo05.copie(tab);
        assertArrayEquals(expResult, result);
    }
    @Test(expected=NullPointerException.class)
    public void testCopieNull() {
        System.out.println("copie");
        int[] tab = null;
        int[] expResult = null;
        int[] result = exo05.copie(tab);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testCopieVide() {
        System.out.println("copie");
        int[] tab = {};
        int[] expResult = {};
        int[] result = exo05.copie(tab);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of pasUneCopie method, of class exo05.
     */
    @Test
    public void testPasUneCopieNull() {
        System.out.println("pasUneCopie");
        int[] tab = null;
        int[] expResult = null;
        int[] result = exo05.pasUneCopie(tab);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testPasUneCopie() {
        System.out.println("pasUneCopie");
        int[] tab = {1, 2, 3};
        int[] expResult = tab;
        int[] result = exo05.pasUneCopie(tab);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testPasUneCopieVide() {
        System.out.println("pasUneCopie");
        int[] tab = {};
        int[] expResult = tab;
        int[] result = exo05.pasUneCopie(tab);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of miroir method, of class exo05.
     */
    @Test
    public void testMiroir() {
        System.out.println("miroir");
        int[] tab = {1, 2, 3};
        int[] expResult = {3, 2, 1};
        int[] result = exo05.miroir(tab);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testMiroirVide() {
        System.out.println("miroir");
        int[] tab = {};
        int[] expResult = {};
        int[] result = exo05.miroir(tab);
        assertArrayEquals(expResult, result);
    }
    @Test(expected=NullPointerException.class)
    public void testMiroirNull() {
        System.out.println("miroir");
        int[] tab = null;
        int[] expResult = null;
        int[] result = exo05.miroir(tab);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testMiroirEgal() {
        System.out.println("miroir");
        int[] tab = {2, 2, 3};
        int[] expResult = {3, 2, 2};
        int[] result = exo05.miroir(tab);
        assertArrayEquals(expResult, result);
    }
}
