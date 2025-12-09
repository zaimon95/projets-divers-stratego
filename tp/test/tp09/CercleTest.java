/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simon
 */
public class CercleTest {


    /**
     * Test of périmètre method, of class Cercle.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testPérimètreNégatif() {
        System.out.println("p\u00e9rim\u00e8tre");
        double rayon = -5;
        double expResult = 2*Math.PI*(-5);
        double result = Cercle.périmètre(rayon);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testPérimètrePositif() {
        System.out.println("p\u00e9rim\u00e8tre");
        double rayon = 5.25;
        double expResult = 2*Math.PI*(5.25);
        double result = Cercle.périmètre(rayon);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testPérimètreNul() {
        System.out.println("p\u00e9rim\u00e8tre");
        double rayon = 0.0;
        double expResult = 2*Math.PI*(0.0);
        double result = Cercle.périmètre(rayon);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class Cercle.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testMain() {
        System.out.println("Avec rayon négatif menant à une exception");
        Cercle.périmètre(-5);
    }
    
}
