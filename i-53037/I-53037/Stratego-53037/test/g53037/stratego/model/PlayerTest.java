package g53037.stratego.model;

import g53037.stratego.model.pieces.Flag;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test(expected = NullPointerException.class)
    public void testConstructPlayerColorIsNull() {
        System.out.println("testConstructPlayerColorIsNull");
        new Player(null);
    }

    @Test
    public void testGetPiecesWhenStockEmpty() {
        System.out.println("testGetPiecesWhenStockEmpty");
        Player instance = new Player(PlayerColor.BLUE);
        List<Piece> result = instance.getPieces();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetPiecesWhenStockFill() {
        System.out.println("testGetPiecesWhenStockFill");
        Player instance = new Player(PlayerColor.BLUE);
        instance.addPiece(new Piece(0, PlayerColor.BLUE));
        instance.addPiece(new Piece(0, PlayerColor.BLUE));
        List<Piece> result = instance.getPieces();
        assertFalse(result.isEmpty());
    }

    @Test
    public void testAddPiece() {
        System.out.println("addPiece");
        Player instance = new Player(PlayerColor.BLUE);
        instance.addPiece(new Piece(0, PlayerColor.BLUE));
        instance.addPiece(new Piece(0, PlayerColor.BLUE));
        List<Piece> expResult = new ArrayList<>();
        expResult.add(new Piece(0, PlayerColor.BLUE));
        expResult.add(new Piece(0, PlayerColor.BLUE));
        List<Piece> result = instance.getPieces();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColorBlue() {
        System.out.println("testGetColorBlue");
        Player instance = new Player(PlayerColor.BLUE);
        PlayerColor expResult = PlayerColor.BLUE;
        PlayerColor result = instance.getColor();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColorRed() {
        System.out.println("testGetColorRed");
        Player instance = new Player(PlayerColor.RED);
        PlayerColor expResult = PlayerColor.RED;
        PlayerColor result = instance.getColor();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = new Player(PlayerColor.BLUE);
        String result = instance.toString();
        assertFalse(result.isEmpty());
    }

    @Test
    public void equalsTrueMySelf() {
        Player player1 = new Player(PlayerColor.BLUE);
        assertTrue(player1.equals(player1));
        assertTrue(player1.hashCode() == player1.hashCode());
    }

    @Test
    public void equalsTrueNoPiece() {
        Player player1 = new Player(PlayerColor.BLUE);
        Player player2 = new Player(PlayerColor.BLUE);
        assertTrue(player1.equals(player2));
        assertTrue(player1.hashCode() == player2.hashCode());
    }

    @Test
    public void equalsTrueWithPiece() {
        Player player1 = new Player(PlayerColor.BLUE);
        Player player2 = new Player(PlayerColor.BLUE);
        player1.addPiece(new Piece(1, PlayerColor.BLUE));
        player2.addPiece(new Piece(1, PlayerColor.BLUE));
        assertTrue(player1.equals(player2));
        assertTrue(player1.hashCode() == player2.hashCode());
    }

    @Test
    public void equalsFalseDifferentColor() {
        Player player1 = new Player(PlayerColor.BLUE);
        Player player2 = new Player(PlayerColor.RED);
        assertFalse(player1.equals(player2));
    }

    @Test
    public void equalsFalseDifferentPiece() {
        Player player1 = new Player(PlayerColor.BLUE);
        Player player2 = new Player(PlayerColor.BLUE);
        player1.addPiece(new Piece(1, PlayerColor.BLUE));
        player2.addPiece(new Piece(2, PlayerColor.BLUE));
        assertFalse(player1.equals(player2));
    }

    @Test
    public void equalsFalseOtherObject() {
        Player player1 = new Player(PlayerColor.BLUE);
        String player2 = "abcd";
        assertFalse(player1.equals(player2));
    }

    @Test
    public void equalsFalseNull() {
        Player player1 = new Player(PlayerColor.BLUE);
        assertFalse(player1.equals(null));
    }

    /**
     * Test of hasFlag method, of class Player.
     */
    @Test
    public void testHasFlagWhenFalse() {
        System.out.println("testHasFlagWhenFalse");
        Player instance = new Player(PlayerColor.BLUE);
        assertFalse(instance.hasFlag());
        
    }
    
    /**
     * Test of hasFlag method, of class Player.
     */
    @Test
    public void testHasFlagWhenTrue() {
        System.out.println("testHasFlagWhenTrue");
        Player instance = new Player(PlayerColor.BLUE);
        Piece piece = new Flag(PlayerColor.BLUE);
        instance.addPiece(piece);
        assertTrue(instance.hasFlag());
    }
    
    @Test
    public void testRemove(){
        System.out.println("testRemove");
        Piece piece = new Piece(0, PlayerColor.BLUE);
        Player player = new Player(PlayerColor.BLUE);
        Player player2 = new Player(PlayerColor.BLUE);
        player.addPiece(piece);
        player.remove(piece);
        assertEquals(player.getPieces(), player2.getPieces());
        
        
    }
}
