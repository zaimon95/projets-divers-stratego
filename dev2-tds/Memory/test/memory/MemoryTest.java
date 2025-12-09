/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import static memory.Memory.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author g53037
 */
public class MemoryTest {

    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void testSearchPosIsFromPos() {
        int[] memory = {1, 1, 1, 0, 0, 0, 5, 0, 5, 3};
        int expected = search(memory, 1, 0);
        int correct = 0;
        assertEquals(expected, correct);
    }
    
    @Test
    public void testSearchNotInArray() {
        int[] memory = {1, 1, 1, 0, 0, 0, 5, 0, 5, 3};
        int expected = search(memory, 4, 3);
        int correct = -1;
        assertEquals(expected, correct);
    }
    
    @Test
    public void testSearchCommon() {
        int[] memory = {1, 1, 1, 0, 0, 0, 5, 0, 5, 3};
        int expected = search(memory, 5, 3);
        int correct = 6;
        assertEquals(expected, correct);
    }
    
    @Test
    public void testSearchPosIsLast() {
        int[] memory = {1, 1, 1, 0, 0, 0, 5, 0, 5, 3};
        int expected = search(memory, 3, 3);
        int correct = memory.length - 1;
        assertEquals(expected, correct);
    }
    
    @Test
    public void testSearchEmptyArray() {
        int[] memory = {};
        int expected = search(memory, 3, 3);
        int correct = -1;
        assertEquals(expected, correct);
    }

    @Test
    public void testSizeStartPosIsLast() {
        int[] memory = {1, 1, 1, 0, 0, 0, 5, 0, 5, 3};
        int expected = size(memory, memory.length);
        int correct = 1;
        assertEquals(expected, correct);
    }
    
    @Test
    public void testSizeStartPosIsFirst() {
        int[] memory = {1, 1, 1, 0, 0, 0, 5, 0, 5, 3};
        int expected = size(memory, 0);
        int correct = 3;
        assertEquals(expected, correct);
    }
    
    @Test
    public void testSizeStartPosIsCommon() {
        int[] memory = {1, 1, 1, 0, 0, 0, 5, 0, 5, 3};
        int expected = size(memory, 3);
        int correct = 3;
        assertEquals(expected, correct);
    }
}
