package g53037.stratego.model;

import g53037.stratego.model.pieces.Flag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class will allow to represent a player. A player is recognized via his
 * color red or blue. Each player has a list of active pieces.
 *
 * @author simon (g53037)
 */
public class Player {

    /**
     * color of the player
     */
    private PlayerColor color;

    /**
     * list of a player's pieces
     */
    private List<Piece> pieces = new ArrayList();

    /**
     *
     * @param color color of the player
     */
    public Player(PlayerColor color) {
        if (color == null) {
            throw new NullPointerException();
        }
        this.color = color;
        pieces = new ArrayList<>();
    }

    /**
     *
     * @return the color of the player
     */
    public PlayerColor getColor() {
        return color;
    }

    /**
     *
     * @return the list of a player's pieces
     */
    public List<Piece> getPieces() {
        return pieces;
    }

    /**
     * add a piece to the list of a player's pieces
     *
     * @param piece
     * @return list of a player's pieces
     */
    public List<Piece> addPiece(Piece piece) {
        pieces.add(piece);
        return pieces;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.color);
        hash = 71 * hash + Objects.hashCode(this.pieces);
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
        final Player other = (Player) obj;
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.pieces, other.pieces)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return true if the Player still has at least one flag. False otherwise.
     */
    public boolean hasFlag() {
        boolean hasFlag = false;
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i) instanceof Flag) {
                hasFlag = true;
                break;
            }
        }
        return hasFlag;
    }

    @Override
    public String toString() {
        String pl = "";
        if (color == PlayerColor.BLUE) {
            pl = "Joueur Bleu";
        } else if (color == PlayerColor.RED) {
            pl = "Joueur Rouge";
        }
        return pl;
    }

    /**
     * remoces a piece from the list of pieces
     * @param piece the piece to remove
     */
    public void remove(Piece piece) {
        if (pieces.contains(piece)) {
            pieces.remove(piece);
        }
    }
}
