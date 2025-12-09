package g53037.stratego.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class PositionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Position instance = new Position(7, 8);
        int expResult = 7;
        int result = instance.getRow();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        Position instance = new Position(4, 6);
        int expResult = 6;
        int result = instance.getColumn();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Position instance = new Position(8, 2);
        String result = instance.toString();
        assertFalse(result.isEmpty());
    }

    @Test
    public void equalsTrueMySelf() {
        Position position1 = new Position(4, 7);
        assertTrue(position1.equals(position1));
        assertTrue(position1.hashCode() == position1.hashCode());
    }

    @Test
    public void equalsTrue() {
        Position position1 = new Position(4, 7);
        Position position2 = new Position(4, 7);
        assertTrue(position1.equals(position2));
        assertTrue(position1.hashCode() == position2.hashCode());
    }

    @Test
    public void equalsFalseDifferentRow() {
        Position position1 = new Position(9, 7);
        Position position2 = new Position(5, 7);
        assertFalse(position1.equals(position2));
    }

    @Test
    public void equalsFalseDifferentColumn() {
        Position position1 = new Position(2, 6);
        Position position2 = new Position(2, 4);
        assertFalse(position1.equals(position2));
    }

    @Test
    public void equalsFalseOtherObject() {
        Position position1 = new Position(2, 6);
        String position2 = "abcd";
        assertFalse(position1.equals(position2));
    }

    @Test
    public void equalsFalseNull() {
        Position position1 = new Position(2, 6);
        assertFalse(position1.equals(null));
    }
    // ici sont les tests 
     @Test
    public void testnextWhenUp() {
        Position position1 = new Position(3, 2);
        Position test = new Position(2, 2);
         assertEquals(test,position1.next(Direction.UP));
        
        
    }
    @Test
    public void testnextWhenDown() {
        Position position1 = new Position(1, 2);
        Position test = new Position(2, 2);
         assertEquals(test,position1.next(Direction.DOWN));
        
    }@Test
    public void testnextWhenLeft() {
        Position position1 = new Position(1, 2);
        Position test = new Position(1, 1);
         assertEquals(test,position1.next(Direction.LEFT));
        
        
    }
    @Test
    public void testnextWhenRight() {
        Position position1 = new Position(1, 2);
        Position test = new Position(1, 3);
         assertEquals(test,position1.next(Direction.RIGHT));
    
    }

}