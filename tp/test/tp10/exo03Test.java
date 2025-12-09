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
public class exo03Test {
    
    @Test(expected = Exception.class)
    public void testAfficherTaillesNull() {
        System.out.println("testAfficherTaillesNull");
        String[] tab = null;
        exo03.afficherTailles(tab);
    }

    @Test
    public void testAfficherTaillesVide() {
        System.out.println("testAfficherTaillesVide");
        String[] tab = {};
        exo03.afficherTailles(tab);
    }

    @Test
    public void testAfficherTaillesTaille3() {
        System.out.println("testAfficherTaillesTaille3");
        String[] tab = {"a", "bc", "def"};
        exo03.afficherTailles(tab);
    }

    @Test
    public void testAfficherTaillesAutreTaille() {
        System.out.println("testAfficherTaillesAutreTaille");
        String[] tab = {"a", "bc", "def", "ghij"};
        exo03.afficherTailles(tab);
    }

    @Test(expected = Exception.class)
    public void testPlusLongMotNull() {
        System.out.println("testPlusLongMotNull");
        String[] tab = null;
        exo03.plusLongMot(tab);
    }

    @Test(expected = Exception.class)
    public void testPlusLongMotVide() {
        System.out.println("testPlusLongMotVide");
        String[] tab = {};
        exo03.plusLongMot(tab);
    }

    @Test
    public void testPlusLongMotDernierMot() {
        System.out.println("testPlusLongMotDernierMot");
        String[] tab = {"a","bc","def"};
        String expResult = "def";
        String result = exo03.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlusLongMotPremierMot() {
        System.out.println("testPlusLongMotPremierMot");
        String[] tab = {"abcde","bc","def","ghij"};
        String expResult = "abcde";
        String result = exo03.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlusLongMotAutreMot() {
        System.out.println("testPlusLongMotAutreMot");
        String[] tab = {"ab","bc","defghij","ghij"};
        String expResult = "defghij";
        String result = exo03.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlusLongMotPlusieursMots() {
        System.out.println("testPlusLongMotPlusieursMots");
        String[] tab = {"abcd","bcef","defg","ghi"};
        String expResult = "abcd";
        String result = exo03.plusLongMot(tab);
        assertEquals(expResult, result);
    }

}
