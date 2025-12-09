package g53037.stratego.model;

import static g53037.stratego.model.SquareType.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Board class represents the game board
 *
 * @author simon
 */
public class Board {

    /**
     * table of squares of the game board
     */
    private final Square[][] squares;

    /**
     * The default constructor initializes the array Square empty of any room
     * with 5 rows and 4 columns
     */
    public Board() {
        squares = new Square[6][5];
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                if ((j >= 1 && j <= 3) && i == 2){
                    squares[i][j] = new Square(WATER);
                } else {
                    squares[i][j] = new Square(LAND);
                }
                if(i == 5 && j == 3){
                    squares[i][j] = new MagicSquare(LAND);
                }
            }
        }
    }

    /**
     *
     * @return a table of boxes of the game board
     */
    public Square[][] getSquares() {
        return squares;
    }

    /**
     *
     * @param position the position of the piece you will add or move
     * @return true if the position given in parameter is contained in the game
     * board and false otherwise
     */
    public boolean isInside(Position position) {
        return (position.getColumn() >= 0 && position.getColumn() < squares[0].length)
                && (position.getRow() >= 0 && position.getRow() < squares.length);
    }

    /**
     *
     * @param position the position of the piece you will add or move
     * @return the square at the given position in parameter.
     * @throws IllegalArgumentException if the position is out of the table
     * @throws NullPointerException if the square at the given position is null
     */
    public Square getSquare(Position position) {
        if (!isInside(position)) {
            throw new IllegalArgumentException();
        }

        if (squares[position.getRow()][position.getColumn()] == null) {
            throw new NullPointerException();
        }
        return squares[position.getRow()][position.getColumn()];
    }

    /**
     * this method allows to place the piece given in parameter on the box
     *
     * @param piece one of the pieces of the player
     * @param position the position of the piece
     * @throws IllegalArgumentException if the position is off the table
     */
    public void put(Piece piece, Position position) {
        if (!isInside(position)) {
            throw new IllegalArgumentException();
        }
        getSquare(position).put(piece);
    }

    /**
     *
     * @param position position to analyse
     * @return true if the given position is free, false otherwise
     * @throws IllegalArgumentException if isInside is false
     */
    public boolean isFree(Position position) {
        if (!isInside(position)) {
            throw new IllegalArgumentException();
        }
        return getSquare(position).getPiece() == null;
    }

    /**
     *
     * @param position position to analyse
     * @param color color of the current player
     * @return true if the given position is of the color given in parameter,
     * false otherwise
     * @throws IllegalArgumentException if isInside is false
     */
    public boolean isMyOwn(Position position, PlayerColor color) {
        if (!isInside(position)) {
            throw new IllegalArgumentException();
        }
        return !isFree(position) && getSquare(position).getPiece().getColor() == color;
    }

    /**
     *
     * @param position position to analyse
     * @return the piece at the given position
     * @throws IllegalArgumentException if inInside is false
     */
    public Piece getPiece(Position position) {
        if (!isInside(position)) {
            throw new IllegalArgumentException();
        }
        return getSquare(position).getPiece();
    }

    /**
     * removes the piece from the given position
     *
     * @param position position to analyse
     */
    public void remove(Position position) {
        if (!isInside(position)) {
            throw new IllegalArgumentException();
        }
        getSquare(position).remove();
    }

    /**
     *
     * @param player player to analyse
     * @return the list of all the positions of the given player
     */
    public List<Position> getTakenSquare(Player player) {
        List<Position> pos = new ArrayList<>();
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                Position position;
                position = new Position(i, j);
                if (isMyOwn(position, player.getColor())) {
                    pos.add(position);
                }
            }
        }
        return pos;
    }
}
