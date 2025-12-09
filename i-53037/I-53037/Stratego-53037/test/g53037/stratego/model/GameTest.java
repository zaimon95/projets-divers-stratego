package g53037.stratego.model;

import static g53037.stratego.model.PlayerColor.BLUE;
import static g53037.stratego.model.PlayerColor.RED;
import static g53037.stratego.model.SquareType.*;
import g53037.stratego.model.pieces.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private final Square[][] defaultBoard = {
        {new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND)},
        {new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND)},
        {new Square(LAND), new Square(WATER), new Square(WATER), new Square(WATER), new Square(LAND)},
        {new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND)},
        {new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND), new Square(LAND)},
        {new Square(LAND), new Square(LAND), new Square(LAND), new MagicSquare(LAND), new Square(LAND)}};

    @Before
    public void setUp() throws Exception {
        defaultBoard[0][1].put(new Flag(RED));
        defaultBoard[3][2].put(new General(RED));
        defaultBoard[1][0].put(new Bomb(RED));
        defaultBoard[1][2].put(new Miner(RED));
        defaultBoard[0][4].put(new Marshal(RED));
        defaultBoard[5][2].put(new Spy(RED));
        defaultBoard[5][4].put(new Scout(RED));
        defaultBoard[4][2].put(new Flag(BLUE));
        defaultBoard[4][1].put(new General(BLUE));
        defaultBoard[3][1].put(new Bomb(BLUE));
        defaultBoard[4][3].put(new Miner(BLUE));
        defaultBoard[5][1].put(new Marshal(BLUE));
        defaultBoard[1][4].put(new Spy(BLUE));
        defaultBoard[4][4].put(new Scout(BLUE));
       
        
    }

    @Test
    public void testInitialize() {
        System.out.println("testInitialize");
        Game instance = new Game();
        instance.initialize();
        Square[][] result = instance.getBoard();
        assertArrayEquals(defaultBoard, result);
    }

    @Test
    public void testStartWhenInsitializeDone() {
        System.out.println("testStartWhenInsitializeDone");
        Game instance = new Game();
        instance.initialize();
        instance.start();
        assertFalse(instance.isOver());
    }

    @Test
    public void testGetBoardWhenGameBegin() {
        System.out.println("testGetBoardWhenGameBegin");
        Game instance = new Game();
        instance.initialize();
        Square[][] expResult = defaultBoard;
        Square[][] result = instance.getBoard();
        assertArrayEquals(expResult, result);
    }

        // à partir d'ici les tests de la classe Game
    @Test
    public void testSelectWhenNotInside() {
        System.out.println("testSelectWhenNotInside");
        Board board = new Board();
        Position position = new Position(7, 0);
        boolean ans = board.isInside(position);
        assertFalse(ans);

    }

    @Test
    public void testSelectWhenIsfree() {
        System.out.println("testSelectWhenIsfree");
        Board board = new Board();
        Position p = new Position(0, 0);
        boolean b = board.isFree(p);
        assertTrue(b);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSelected() {
        System.out.println("testGetSelected");
        Board board = new Board();
        Piece p = board.getPiece(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetMoves() {
        System.out.println("testGetMoves");
        Game jeux = new Game();
        jeux.initialize();
        Position selected = new Position(4, 0);
        List<Move> ans = new ArrayList();
        Move deplacement = new Move(new Piece(0, BLUE), selected, selected.next(Direction.DOWN));
        ans.add(deplacement);
        List<Move> resultat = jeux.getMoves();
        assertEquals(ans, resultat);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyWhenMoveIsNull() {
        System.out.println("testApply");
        Game jeux = new Game();
        jeux.initialize();
        Board board = new Board();
        Piece piecedepart = new Piece(0, BLUE);
        Position pos = new Position(5, 1);
        Move dep = new Move(piecedepart, pos, pos.next(Direction.DOWN));
        board.isFree(dep.getEnd());
        board.put(piecedepart, dep.getEnd());
    }

    @Test
    public void testApply() {
        System.out.println("testApply");
        Model game = new Game();
        game.initialize();
        Position start = new Position(3, 2);
        Position end = new Position(4, 2);
        Move move = new Move(game.getSelected(3, 2), start, end);
        game.apply(move);
    }

    @Test
    public void testHasMoves() {
        System.out.println("testHasMoves");
        Game jeux = new Game();
        jeux.initialize();
        assertTrue(jeux.hasMoves(jeux.getCurrent()));
        jeux.swapPlayers();
        assertTrue(jeux.hasMoves(jeux.getCurrent()));

    }
    
    @Test
    public void testIsOverWhenNoFlag() {
        System.out.println("testIsOverWhenNoFlag");
        Game game = new Game();
        game.initialize();
    }
    
    @Test
    public void testIsOverWhenNoMoves() {
        System.out.println("testIsOverWhenNoMoves");
        Game game = new Game();
        game.initialize();
    }
    
    @Test
    public void testSwapPlayer() {
        System.out.println("testSawpPlayer");
       Game game = new Game();
       game.initialize();
       PlayerColor red = game.getCurrent().getColor();

    }
}
