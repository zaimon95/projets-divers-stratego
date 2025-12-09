package g53037.stratego.model;

import static g53037.stratego.model.PlayerColor.BLUE;
import static g53037.stratego.model.PlayerColor.RED;
import g53037.stratego.model.pieces.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class PieceTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testConstructPieceWhenRankIsZero() {
        System.out.println("testConstructPieceWhenRankIsZero");
        Piece instance = new Piece(0, BLUE);
        assertEquals(BLUE, instance.getColor());
        assertEquals(0, instance.getRank());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructPieceWhenRankIsNegative() {
        System.out.println("testConstructPieceWhenRankIsNegative");
        Piece instance = new Piece(-1, BLUE);
    }

    @Test
    public void testConstructPieceWhenRankIsOne() {
        System.out.println("testConstructPieceWhenRankIsOne");
        Piece instance = new Piece(1, BLUE);
        assertEquals(BLUE, instance.getColor());
        assertEquals(1, instance.getRank());
    }

    @Test
    public void testGetColorBlue() {
        System.out.println("testGetColorBlue");
        Piece instance = new Piece(0, BLUE);
        PlayerColor expResult = BLUE;
        PlayerColor result = instance.getColor();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColorRed() {
        System.out.println("testGetColorRed");
        Piece instance = new Piece(12, RED);
        PlayerColor expResult = RED;
        PlayerColor result = instance.getColor();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Piece instance = new Piece(0, BLUE);
        String result = instance.toString();
        assertFalse(result.isEmpty());

    }

    @Test
    public void equalsTrueMySelf() {
        Piece piece1 = new General(BLUE);
        assertTrue(piece1.equals(piece1));
        assertTrue(piece1.hashCode() == piece1.hashCode());
    }

    @Test
    public void equalsTrue() {
        Piece piece1 = new Flag(BLUE);
        Piece piece2 = new Flag(BLUE);
        assertTrue(piece1.equals(piece2));
        assertTrue(piece1.hashCode() == piece2.hashCode());
    }

    @Test
    public void equalsFalseDifferentColor() {
        Piece piece1 = new Piece(10, BLUE);
        Piece piece2 = new Piece(10, RED);
        assertFalse(piece1.equals(piece2));
    }

    @Test
    public void equalsFalseDifferentRank() {
        Piece piece1 = new General(BLUE);
        Piece piece2 = new Flag(BLUE);
        assertFalse(piece1.equals(piece2));
    }

    @Test
    public void equalsFalseOtherObject() {
        Piece piece1 = new Piece(10, BLUE);
        String piece2 = "abcd";
        assertFalse(piece1.equals(piece2));
    }

    @Test
    public void equalsFalseNull() {
        Piece piece1 = new Piece(0, BLUE);
        assertFalse(piece1.equals(null));
    }
    // apd d'ici les nouveaux tests
    @Test
    public void testisStronger(){
        Piece piece1 = new General(BLUE);
        Piece piece2 = new Flag(BLUE);
        boolean b = piece1.isStronger(piece2);
        assertTrue(b);
    }
    
    @Test
    public void testhasSameRank(){
        Piece piece1 = new Flag(BLUE);
        Piece piece2 = new Flag(RED);
        boolean b = piece1.hasSameRank(piece2);
        assertTrue(b);
    }

    /**
     * Test of getNbSteps method, of class Piece.
     */
    @Test
    public void testGetNbStepsWhenZero() {
        System.out.println("testGetNbSteps");
        Piece piece1 = new Flag(BLUE);
        int nbSteps1 = piece1.getNbSteps();
        assertEquals(nbSteps1, 0);
    }
    
    /**
     * Test of getNbSteps method, of class Piece.
     */
    @Test
    public void testGetNbStepsWhenOne() {
        System.out.println("testGetNbSteps");
        Piece piece1 = new General(BLUE);
        int nbSteps1 = piece1.getNbSteps();
        assertEquals(nbSteps1, 1);
    }
    
    /**
     * Test of getNbSteps method, of class Piece.
     */
    @Test
    public void testGetNbStepsWhenTwo() {
        System.out.println("testGetNbSteps");
        Piece piece1 = new Scout(BLUE);
        int nbSteps1 = piece1.getNbSteps();
        assertEquals(nbSteps1, 2);
    }

    /**
     * Test of getRank method, of class Piece.
     */
    @Test
    public void testGetRank() {
        System.out.println("testGetNbSteps");
        Piece piece1 = new Flag(BLUE);
        int rank1 = piece1.getRank();
        assertEquals(rank1, 0);
    }

    /**
     * Test of canCross method, of class Piece.
     */
    @Test
    public void testCanCrossWhenFalse() {
        System.out.println("testCanCrossWhenFalse");
        Piece piece = new Piece(0, BLUE);
        Square instance = new Square(SquareType.WATER);
        assertFalse(piece.canCross(instance));
    }
    
    /**
     * Test of canCross method, of class Piece.
     */
    @Test
    public void testCanCrossWhenTrue() {
        System.out.println("testCanCrossWhenTrue");
        Piece piece = new Piece(0, BLUE);
        Square instance = new Square(SquareType.LAND);
        assertTrue(piece.canCross(instance));
    }
    
    

}