package g53037.stratego.model;

import static g53037.stratego.model.PlayerColor.BLUE;
import static g53037.stratego.model.SquareType.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testIsFreeTrue() {
        System.out.println("testIsFreeTrue");
        Square instance = new Square(LAND);
        boolean expResult = true;
        boolean result = instance.isFree();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFreeFalse() {
        System.out.println("testIsFreeFalse");
        Square instance = new Square(LAND);
        instance.put(new Piece(4, PlayerColor.BLUE));
        boolean expResult = false;
        boolean result = instance.isFree();
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testPutWhenPieceIsNull() {
        System.out.println("testPutWhenPieceIsNull");
        Piece piece = null;
        Square instance = new Square(LAND);
        instance.put(piece);
    }

    @Test
    public void testPutWhenSquareIsEmpty() {
        System.out.println("testPutWhenSquareIsEmpty");
        Piece piece = new Piece(8, PlayerColor.RED);
        Square instance = new Square(LAND);
        instance.put(piece);
        Piece expResult = instance.getPiece();
        assertEquals(expResult, piece);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetPieceWhenSquareFill() {
        System.out.println("testGetPieceWhenSquareFill");
        Piece piece1 = new Piece(8, PlayerColor.RED);
        Piece piece2 = new Piece(1, PlayerColor.BLUE);
        Square instance = new Square(LAND);
        instance.put(piece1);
        instance.put(piece2);
    }

    @Test
    public void testGetPieceWhenSquareEmpty() {
        System.out.println("testGetPieceWhenSquareEmpty");
        Square instance = new Square(LAND);
        Piece expResult = instance.getPiece();
        assertNull(expResult);
    }

    @Test
    public void equalsTrueMyself() {
        Square square1 = new Square(LAND);
        assertTrue(square1.equals(square1));
        assertTrue(square1.hashCode() == square1.hashCode());
    }

    @Test
    public void equalsTrueEmpty() {
        Square square1 = new Square(LAND);
        Square square2 = new Square(LAND);
        assertTrue(square1.equals(square2));
        assertTrue(square1.hashCode() == square2.hashCode());
    }
    
    @Test
    public void equalsTrueSameContent() {
        Square square1 = new Square(LAND);
        Square square2 = new Square(LAND);
        square1.put(new Piece(1,  BLUE));
        square2.put(new Piece(1,  BLUE));
        assertTrue(square1.equals(square2));
    }


    @Test
    public void equalsFalseDifferentContent() {
        Square square1 = new Square(LAND);
        Square square2 = new Square(LAND);
        square1.put(new Piece(1,  BLUE));
        square2.put(new Piece(3,  BLUE));
        assertFalse(square1.equals(square2));
    }

    @Test
    public void equalsFalseOneEmpty() {
        Square square1 = new Square(LAND);
        Square square2 = new Square(LAND);
        square1.put(new Piece(1, BLUE));
        assertFalse(square1.equals(square2));
    }

    @Test
    public void equalsFalseOtherObject() {
        Square square1 = new Square(LAND);
        String square2 = "abcd";
        assertFalse(square1.equals(square2));
    }

    @Test
    public void equalsFalseNull() {
        Square square1 = new Square(LAND);
        assertFalse(square1.equals(null));
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Square instance = new Square(LAND);
        String result = instance.toString();
        assertFalse(result.isEmpty());
        
        
    }
     @Test
    public void testisMyOwnWhenTrue(){
        Square instance = new  Square(LAND);
        instance.put(new Piece(1,  PlayerColor.BLUE));
        assertTrue(instance.isMyOwn(PlayerColor.BLUE));
    }
    
     @Test
    public void testisMyOwnWhenFalse(){
        Square instance = new  Square(LAND);
        instance.put(new Piece(2,  PlayerColor.RED));
        assertFalse(instance.isMyOwn(PlayerColor.BLUE));
    }
    
     @Test(expected = NullPointerException.class)
    public void testisMyOwnWhenNull(){
        Square instance = new  Square(LAND);
        Piece piece = null;
        instance.put(piece);
    }   
    /**
     * Test of remove method, of class Square.
     */
    @Test
    public void testRemove() {
        
    }

    /**
     * Test of isLand method, of class Square.
     */
    @Test
    public void testIsLandWhenTrue() {
        System.out.println("testIsLandWhenTrue");
        Square instance = new Square(LAND);
        assertTrue(instance.isLand());
    }
    
    /**
     * Test of isLand method, of class Square.
     */
    @Test
    public void testIsLandWhenFalse() {
        System.out.println("testIsLandWhenFalse");
        Square instance = new Square(WATER);
        assertFalse(instance.isLand());
    }
}