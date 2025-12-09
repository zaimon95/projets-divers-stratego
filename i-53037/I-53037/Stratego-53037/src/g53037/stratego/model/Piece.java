/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.stratego.model;

import g53037.stratego.view.ColorText;
import java.util.Objects;

/**
 * The pieces of the game represent military units. Each piece has a rank, that
 * is to say, a number to recognize it in the hierarchy. A room has also a color
 * to identify his side
 *
 * @author simon
 */
public class Piece {

    /**
     * represents the rank of the piece
     */
    public int rank;

    /**
     * represents the color of the piece
     */
    protected PlayerColor color;
    
    int nbSteps;
    
    boolean flagLike;

    /**
     * takes in parameter the rank and the color of the piece to initialize the
     * attributes of the piece
     *
     * @param rank
     * @param color
     */
    public Piece(int rank, PlayerColor color) {
        if (rank < 0) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.color = color;
        nbSteps = 1;
        flagLike = true;
    }

    public boolean isFlagLike() {
        return flagLike;
    }

    public void setFlagLike(boolean flagLike) {
        this.flagLike = flagLike;
    }
    
    public Piece(int rank, int nbSteps, PlayerColor color) {
        if (rank < 0 || nbSteps < 0) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.color = color;
        this.nbSteps = nbSteps;
        flagLike = true;
    }

    public void setRank(int rank) {
        if (rank < 0) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
    }

    public int getNbSteps() {
        return nbSteps;
    }

    /**
     *
     * @return the rank of the piece
     */
    public int getRank() {
        return rank;
    }

    /**
     *
     * @return the color of the piece
     */
    public PlayerColor getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.rank;
        hash = 53 * hash + Objects.hashCode(this.color);
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
        final Piece other = (Piece) obj;
        if (this.rank != other.rank) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String pion;
        if (this.color == PlayerColor.BLUE) {
            pion = ColorText.toBlue("PE");
        } else {
            pion = ColorText.toRed("PE");
        }
        return pion;
    }

    /**
     * 
     * @param other the piece to compare with the attribute Piece
     * @return true if the rank of the piece given in attribute is higher than 
     * the piece given as argument
     */
    public boolean isStronger(Piece other) {
        return rank >= other.rank;
    }

    /**
     * 
     * @param other the piece to compare with the attribute Piece
     * @return true if the rank of the piece given in attribute is equal to 
     * the piece given as argument
     */
    public boolean hasSameRank(Piece other) {
        return rank == other.rank;
    }
    
    
    boolean canCross(Square square){
        return square.isLand();
    }
}
