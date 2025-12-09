/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.stratego.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import g53037.stratego.*;
import static g53037.stratego.model.SquareType.*;
import g53037.stratego.model.pieces.Bomb;
import g53037.stratego.model.pieces.Flag;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;


public class BoardTest {

    private final Square[][] defaultBoard = {
        {new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND)},
        {new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND)},
        {new Square(LAND), new Square(WATER), new Square(WATER), new Square(WATER), new Square(LAND)},
        {new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND)},
        {new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND)},
        {new Square(LAND), new Square(LAND), new Square(LAND), new MagicSquare(LAND), new Square(LAND)}};

    @Before
    public void setUp() throws Exception {
    }
    

    @Test
    public void testGetSquareWhenSquareIsFill() {
        System.out.println("testGetSquareWhenSquareIsFill");
        Position position = new Position(3, 2);
        Board instance = new Board();
        instance.put(new Piece(4, PlayerColor.BLUE), position);
        Square expResult = new Square(LAND);
        expResult.put(new Piece(4, PlayerColor.BLUE));
        Square result = instance.getSquare(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSquareWhenSquareIsEmpty() {
        System.out.println("testGetSquareWhenSquareIsEmpty");
        Position position = new Position(0, 1);
        Board instance = new Board();
        Square expResult = new Square(LAND);
        Square result = instance.getSquare(position);
        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSquareWhenPositionOutside() {
        System.out.println("testGetSquareWhenPositionOutside");
        Position position = new Position(-1, 2);
        Board instance = new Board();
        instance.getSquare(position);
    }

    @Test
    public void testGetSquaresWhenDefaultBoard() {
        System.out.println("testGetSquaresWhenDefaultBoard");
        Board instance = new Board();
        Square[][] expResult = defaultBoard;
        Square[][] result = instance.getSquares();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testGetSquaresWhen2PiecesAdded() {
        System.out.println("testGetSquaresWhen2PiecesAdded");
        Board instance = new Board();
        instance.put(new Piece(4, PlayerColor.RED), new Position(1, 2));
        instance.put(new Piece(1, PlayerColor.BLUE), new Position(4, 3));
        Square[][] expResult = defaultBoard;
        defaultBoard[1][2].put(new Piece(4, PlayerColor.RED));
        defaultBoard[4][3].put(new Piece(1, PlayerColor.BLUE));
        Square[][] result = instance.getSquares();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testPutOnePiece() {
        System.out.println("testPutOnePiece");
        Piece piece = new Piece(2, PlayerColor.BLUE);
        Position position = new Position(0, 0);
        Board instance = new Board();
        instance.put(piece, position);
        Square expResult = new Square(LAND);
        expResult.put(piece);
        Square result = instance.getSquare(position);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testPutWhenPieceIsNull() {
        System.out.println("testPutWhenPieceIsNull");
        Piece piece = null;
        Position position = new Position(2, 2);
        Board instance = new Board();
        instance.put(piece, position);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutWhenPositionIsOutside() {
        System.out.println("testPutWhenPositionIsOutside");
        Piece piece = new Piece(1, PlayerColor.BLUE);
        Position position = new Position(6, 2);
        Board instance = new Board();
        instance.put(piece, position);
    }

    @Test
    public void testIsInsideWhenCornerUpLeft() {
        System.out.println("testIsInsideWhenCornerUpLeft");
        Position position = new Position(0, 0);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenCornerUpRight() {
        System.out.println("testIsInsideWhenCornerUpRight");
        Position position = new Position(0, 3);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenCornerDownleft() {
        System.out.println("testIsInsideWhenCornerDownleft");
        Position position = new Position(4, 0);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenCornerDownRight() {
        System.out.println("testIsInsideWhenCornerDownRight");
        Position position = new Position(4, 3);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenBoundaryUp() {
        System.out.println("testIsInsideWhenBoundaryUp");
        Position position = new Position(0, 1);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenBoundaryDown() {
        System.out.println("testIsInsideWhenBoundaryDown");
        Position position = new Position(4, 2);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenBoundaryLeft() {
        System.out.println("testIsInsideWhenBoundaryLeft");
        Position position = new Position(1, 0);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenBoundaryRight() {
        System.out.println("testIsInsideWhenBoundaryRight");
        Position position = new Position(3, 3);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenOutsideBoundaryUp() {
        System.out.println("testIsInsideWhenOutsideBoundaryUp");
        Position position = new Position(-1, 1);
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenOutsideBoundaryDown() {
        System.out.println("testIsInsideWhenOutsideBoundaryDown");
        Position position = new Position(6, 2);
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenOutsideBoundaryLeft() {
        System.out.println("testIsInsideWhenOutsideBoundaryLeft");
        Position position = new Position(1, -1);
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenOutsideBoundaryRight() {
        System.out.println("testIsInsideWhenOutsideBoundaryRight");
        Position position = new Position(3, 5);
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsInsideWhenInside() {
        System.out.println("testIsInsideWhenInside");
        Position position = new Position(2, 1);
        Board instance = new Board();
        boolean expResult = true;
        boolean result = instance.isInside(position);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testIsInsideWhenPositionIsNull() {
        System.out.println("testIsInsideWhenPositionIsNull");
        Board instance = new Board();
        instance.isInside(null);
        
    }

    @Test
    public void testIsFreeWhenInsideAndIsTrue() {
        System.out.println("testIsFreeWhenInsideAndIsTrue");
        Position position = new Position(2, 1);
        Board instance = new Board();
        Piece p = new Piece(0, PlayerColor.BLUE);
        instance.put(p, new Position(3, 2));
        boolean expResult = true;
        boolean result = instance.isFree(position);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsFreeWhenInsideAndIsFalse() {
        System.out.println("testIsFreeWhenInsideAndIsFalse");
        Position position = new Position(3, 2);
        Board instance = new Board();
        Piece p = new Piece(0, PlayerColor.BLUE);
        instance.put(p, new Position(3, 2));
        boolean expResult = false;
        boolean result = instance.isFree(position);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsFreeWhenNotInside() {
        System.out.println("testIsFreeWhenNotInside");
        Position position = new Position(9, 2);
        Board instance = new Board();
        instance.isFree(position);
    }

    /**
     * Test of isMyOwn method, of class Board.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIsMyOwnWhenNotInside() {
        System.out.println("testIsMyOwnWhenNotSameColor");
        Position position = new Position(9, 2);
        Board instance = new Board();
        instance.isMyOwn(position, PlayerColor.BLUE);
    }

    /**
     * Test of isMyOwn method, of class Board.
     */
    @Test
    public void testIsMyOwnWhenSameColor() {
        System.out.println("testIsMyOwnWhenSameColor");
        Position position = new Position(3, 2);
        Board instance = new Board();
        instance.isMyOwn(position, PlayerColor.BLUE);
    }

    /**
     * Test of getPiece method, of class Board.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetPieceWhenNotInside() {
        System.out.println("testGetPieceWhenNotInside");
        Position position = new Position(9, 2);
        Board instance = new Board();
        instance.getPiece(position);
    }
    
    /**
     * Test of getPiece method, of class Board.
     */
    @Test
    public void testGetPieceWhenInside() {
        System.out.println("testGetPieceWhenInside");
        Position position = new Position(3, 2);
        Board instance = new Board();
        instance.getPiece(position);
    }

    /**
     * Test of remove method, of class Board.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWhenNotInside() {
        System.out.println("testRemoveWhenNotInside");
        Board board = new Board();
        Position pos = new Position(3, 6);
        board.getSquare(pos).remove();
    }
    
    /**
     * Test of remove method, of class Board.
     */
    @Test
    public void testRemoveWhenInside() {
        System.out.println("testRemoveWhenInside");
        Board board = new Board();
        Piece piece = new Piece(4, PlayerColor.BLUE);
        Position pos = new Position(3, 3);
        board.put(piece, pos);
        assertFalse(board.isFree(pos));
        board.remove(pos);
        assertTrue(board.isFree(pos));
        
    }

    /**
     * Test of getTakenSquare method, of class Board.
     */
    @Test
    public void testGetTakenSquare() {
        System.out.println("testGetTakenSquare");
        Player player = new Player(PlayerColor.RED);
        Board instance = new Board();
        Game game = new Game();
        game.initialize();
        Piece piece1 = new Piece(0, PlayerColor.RED);
        Piece piece2 = new Piece(0, PlayerColor.RED);
        Position pos1 = new Position(0, 1);
        Position pos2 = new Position(3, 2);
        instance.put(piece1, pos1);
        instance.put(piece2, pos2);
        player.addPiece(piece1);
        player.addPiece(piece2);
        List<Position> expResult = new ArrayList<>();
        expResult.add(pos1);
        expResult.add(pos2);
        List<Position> result = instance.getTakenSquare(player);
        assertEquals(expResult, result);
    }
}



