/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.stratego.model;

import static g53037.stratego.model.SquareType.*;
import java.util.Objects;
import g53037.stratego.view.ColorText;

/**
 * Each box on the game board will be represented by an instance of the Square
 * class. In this iteration all the boxes are of type ground, there is not yet a
 * lake on the game board. A board slot can accommodate a single piece of a
 * player.
 *
 * @author simon
 */
public class Square {

    /**
     * represents the piece present on the box, If no piece is on the box this
     * attribute is null
     */
    protected Piece piece;
    
    /**
     * type of the square
     */
    SquareType type;
    
    /**
     * Construct an empty square without a piece
     */
    public Square(SquareType type) {
        this.piece = null;
        this.type = type;
    }

    /**
     *
     * @return true if piece is null, false otherwise
     */
    public boolean isFree() {
        return this.piece == null;
    }

    /**
     *
     * @param color the color of the player
     * @return true if the color given as parameter is the same as the color
     * of the piece given as attribute
     */
    public boolean isMyOwn(PlayerColor color) {
        return piece.getColor() == color;
    }

    /**
     * removes a piece from the given square
     */
    public void remove() {
        piece = null;
    }

    /**
     *
     * @return the piece present on the box
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * this method makes it possible to place the piece given as parameter on
     * the box.
     *
     * @param piece the piece present on the box
     * @throws IllegalStateException if a piece is already present
     * @throws NullPointerException if the piece given as parameter is null
     */
    public void put(Piece piece) {
        if (piece == null) {
            throw new NullPointerException();
        }
        if (!isFree()) {
            throw new IllegalStateException();
        }
        this.piece = piece;

    }

    @Override
    public String toString() {
        if (piece == null) {
            if(type == LAND) {
                return " " + ColorText.bgtoGrey("  ") + " ";
            }
            else if(type == WATER){
                return " " + ColorText.bgtoBlue("  ") + " ";
            }
        }
        return " " + ColorText.bgtoGrey("" + piece) + " ";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.piece);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Square other = (Square) obj;
        if (!Objects.equals(this.piece, other.piece)) {
            return false;
        }
        return true;
    }

    public boolean isLand(){
        return type == LAND;
    }
}
