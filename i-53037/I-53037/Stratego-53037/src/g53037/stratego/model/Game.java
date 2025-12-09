package g53037.stratego.model;

import g53037.stratego.model.pieces.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simon
 */
public class Game implements Model {

    private Board board;

    private Player current;

    private Player opponent;

    private Position selected;

    public Game() {
        current = new Player(PlayerColor.RED);
        opponent = new Player(PlayerColor.BLUE);
    }

    @Override
    public void initialize() {
        board = new Board();

        Piece pieceR1 = new Flag(PlayerColor.RED);
        Piece pieceR2 = new General(PlayerColor.RED);
        Piece pieceR3 = new Bomb(PlayerColor.RED);
        Piece pieceR4 = new Miner(PlayerColor.RED);
        Piece pieceR5 = new Marshal(PlayerColor.RED);
        Piece pieceR6 = new Spy(PlayerColor.RED);
        Piece pieceR7 = new Scout(PlayerColor.RED);
        Piece pieceB1 = new Flag(PlayerColor.BLUE);
        Piece pieceB2 = new General(PlayerColor.BLUE);
        Piece pieceB3 = new Bomb(PlayerColor.BLUE);
        Piece pieceB4 = new Miner(PlayerColor.BLUE);
        Piece pieceB5 = new Marshal(PlayerColor.BLUE);
        Piece pieceB6 = new Spy(PlayerColor.BLUE);
        Piece pieceB7 = new Scout(PlayerColor.BLUE);

        Position positionR1 = new Position(0, 1);
        Position positionR2 = new Position(3, 2);
        Position positionR3 = new Position(1, 0);
        Position positionR4 = new Position(1, 2);
        Position positionR5 = new Position(0, 4);
        Position positionR6 = new Position(5, 2);
        Position positionR7 = new Position(5, 4);
        Position positionB1 = new Position(4, 2);
        Position positionB2 = new Position(4, 1);
        Position positionB3 = new Position(3, 1);
        Position positionB4 = new Position(4, 3);
        Position positionB5 = new Position(5, 1);
        Position positionB6 = new Position(1, 4);
        Position positionB7 = new Position(4, 4);

        board.put(pieceR1, positionR1);
        board.put(pieceR2, positionR2);
        board.put(pieceR3, positionR3);
        board.put(pieceR4, positionR4);
        board.put(pieceR5, positionR5);
        board.put(pieceR6, positionR6);
        board.put(pieceR7, positionR7);
        board.put(pieceB1, positionB1);
        board.put(pieceB2, positionB2);
        board.put(pieceB3, positionB3);
        board.put(pieceB4, positionB4);
        board.put(pieceB5, positionB5);
        board.put(pieceB6, positionB6);
        board.put(pieceB7, positionB7);

        current.addPiece(pieceR1);
        current.addPiece(pieceR2);
        current.addPiece(pieceR3);
        current.addPiece(pieceR4);
        current.addPiece(pieceR5);
        current.addPiece(pieceR6);
        current.addPiece(pieceR7);
        opponent.addPiece(pieceB1);
        opponent.addPiece(pieceB2);
        opponent.addPiece(pieceB3);
        opponent.addPiece(pieceB4);
        opponent.addPiece(pieceB5);
        opponent.addPiece(pieceB6);
        opponent.addPiece(pieceB7);
    }

    @Override
    public void start() {
        if (!isOver() && board == null) {
            throw new IllegalStateException();
        }
    }

    @Override
    public boolean isOver() {
        boolean isOver = false;
        if ((!opponent.hasFlag() || !current.hasFlag()) || (!hasMoves(current) && !hasMoves(opponent))) {
            isOver = true;
        }
        return isOver;
    }

    @Override
    public Square[][] getBoard() {
        return board.getSquares();
    }

    @Override
    public void select(int row, int column) {
        if (!board.isInside(new Position(row, column))) {
            throw new IllegalArgumentException();
        }
        if (board.isFree(new Position(row, column))) {
            throw new NullPointerException();
        }
        if (board.isMyOwn(new Position(row, column), opponent.getColor())) {
            throw new IllegalStateException();
        }
        selected = new Position(row, column);
    }

    @Override
    public Piece getSelected(int row, int col) {
        select(row, col);
        if (selected == null) {
            throw new NullPointerException();
        }
        return board.getPiece(selected);
    }

    @Override
    public List<Move> getMoves() {
        return getMoves(selected);
    }

    private List<Move> getMoves(Position selected) {
        if (selected == null) {
            throw new IllegalStateException();
        }
        List<Move> moves = new ArrayList<>();
        Piece piece = board.getPiece(selected);
        if (piece.getNbSteps() == 1) {
            for (Direction direction : Direction.values()) {
                if (board.isInside(selected.next(direction))
                        && (board.isFree(selected.next(direction))
                        || board.isMyOwn(selected.next(direction), opponent.getColor()))
                        && board.getPiece(selected).canCross(board.getSquare(selected.next(direction)))) {
                    moves.add(new Move(board.getPiece(selected), selected, selected.next(direction)));
                }
            }
        } else if (piece.getNbSteps() == 2) {
            for (Direction direction : Direction.values()) {
                if (board.isInside(selected.next(direction))
                        && (board.isFree(selected.next(direction))
                        || board.isMyOwn(selected.next(direction), opponent.getColor()))
                        && board.getPiece(selected).canCross(board.getSquare(selected.next(direction)))) {
                    moves.add(new Move(board.getPiece(selected), selected, selected.next(direction)));
                }
                if (board.isInside(selected.next(direction).next(direction))
                        && (board.isFree(selected.next(direction).next(direction))
                        || board.isMyOwn(selected.next(direction).next(direction), opponent.getColor()))
                        && board.getPiece(selected).canCross(board.getSquare(selected.next(direction).next(direction)))) {
                    moves.add(new Move(board.getPiece(selected), selected, selected.next(direction).next(direction)));
                }
            }
        }
        return moves;
    }

    @Override
    public void apply(Move move) {
        if (move == null) {
            throw new NullPointerException();
        }
        Piece piece = board.getPiece(move.getStart());
        board.remove(move.getStart());
        if (board.isFree(move.getEnd())) {
            board.put(piece, move.getEnd());
            piece.setFlagLike(false);
        } else {
            if (piece.isStronger(board.getPiece(move.getEnd()))
                    && !piece.hasSameRank(board.getPiece(move.getEnd()))) {
                opponent.remove(board.getPiece(move.getEnd()));
                board.remove(move.getEnd());
                board.put(piece, move.getEnd());
                piece.setFlagLike(false);
            } else if (piece.hasSameRank(board.getPiece(move.getEnd()))) {
                opponent.remove(board.getPiece(move.getEnd()));
                current.remove(piece);
                board.remove(move.getEnd());
            } else{
                board.getPiece(move.getEnd()).setFlagLike(false);
            }
        }
        swapPlayers();
    }

    /**
     * swaps the player every turn if the opponent still has moves
     */
    public void swapPlayers() {
        if (hasMoves(opponent)) {
            Player provisoire = current;
            current = opponent;
            opponent = provisoire;
        }
    }

    @Override
    public Player getCurrent() {
        return current;

    }

    @Override
    public boolean hasMoves(Player player) {
        boolean doesItHaveMoves = false;
        for (Position takenSquare : board.getTakenSquare(player)) {
            if (!getMoves(takenSquare).isEmpty()) {
                return true;
            }
        }
        return doesItHaveMoves;
    }

    @Override
    public List<Player> getWinners() {
        List<Player> winners = new ArrayList<>();
        if (isOver() && !current.hasFlag()) {
            winners.add(opponent);
        } else if (isOver() && !hasMoves(current) && !hasMoves(opponent)) {
            winners.add(current);
            winners.add(opponent);
        }
        return winners;
    }
}
