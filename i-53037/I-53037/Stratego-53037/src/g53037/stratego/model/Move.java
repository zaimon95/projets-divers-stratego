/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.stratego.model;

/**
 *
 * @author simon
 */
public class Move {

    private final Piece piece;

    private final Position start;

    private final Position end;

    public Move(Piece piece, Position start, Position end) {
        if (piece == null || start == null || end == null) {
            throw new NullPointerException();
        }
        this.piece = piece;
        this.start = start;
        this.end = end;
    }

    /**
     *
     * @return the piece given as attribute
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     *
     * @return the initial position of the piece
     */
    public Position getStart() {
        return start;
    }

    /**
     *
     * @return the final position of the piece
     */
    public Position getEnd() {
        return end;
    }

}
