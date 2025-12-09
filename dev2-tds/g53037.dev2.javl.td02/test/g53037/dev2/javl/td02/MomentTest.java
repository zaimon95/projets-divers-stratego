/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev2.javl.td02;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author g53037
 */
public class MomentTest {


    /**
     * Test of getHour method, of class Moment.
     */
    @Test
    public void testGetHour() {
        Moment moment1 = new Moment(1,2,3);
        int expected = moment1.getHour();
        int result = 1;
        assertEquals(expected, result);
    }

    /**
     * Test of getMinute method, of class Moment.
     */
    @Test
    public void testGetMinute() {
        Moment moment1 = new Moment(1,2,3);
        int expected = moment1.getMinute();
        int result = 2;
        assertEquals(expected, result);
    }

    /**
     * Test of getSecond method, of class Moment.
     */
    @Test
    public void testGetSecond() {
        Moment moment1 = new Moment(1,2,3);
        int expected = moment1.getSecond();
        int result = 3;
        assertEquals(expected, result);
    }

    /**
     * Test of toString method, of class Moment.
     */
    @Test
    public void testToString() {
        Moment moment1 = new Moment(1,2,3);
        String expected = moment1.toString();
        String result = "01:02:03";
        assertEquals(expected, result);
    }

    /**
     * Test of compareTo method, of class Moment.
     */
    @Test
    public void testCompareTo() {
        Moment moment1 = new Moment(1,2,3);
        Moment moment2 = new Moment(1,2,3);
        int expected = moment1.compareTo(moment2);
        int result = 0;
        assertEquals(expected, result);
    }
    
    /**
     * Test of compareTo method, of class Moment.
     */
    @Test
    public void testCompareToPosterieur() {
        Moment moment1 = new Moment(1,2,3);
        Moment moment2 = new Moment(1,2,2);
        int expected = moment1.compareTo(moment2);
        int result = 1;
        assertEquals(expected, result);
    }
    
    /**
     * Test of compareTo method, of class Moment.
     */
    @Test
    public void testCompareToAnterieur() {
        Moment moment1 = new Moment(1,2,3);
        Moment moment2 = new Moment(10,2,3);
        int expected = moment1.compareTo(moment2);
        int result = -1;
        assertEquals(expected, result);
    }
}
