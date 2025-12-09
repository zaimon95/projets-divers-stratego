/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.stratego.model;

import java.util.List;

/**
 * Model of Stratego.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Facade_pattern">
 * Model pattern
 * </a>
 * @see
 * <a href="https://fr.wikipedia.org/wiki/Fa%C3%A7ade_(patron_de_conception)">
 * Façade (patron de conception)
 * </a>
 * @author Simon
 */
public interface Model {

    /**
     * Initializes the stratego game with a default board.
     */
    void initialize();

    /**
     * Checks if a match can start.
     *
     * @throws IllegalStateException if no board is set.
     * @throws IllegalStateException if the board set is incomplete.
     */
    void start();

    /**
     * Declares if it's the end of the game.
     *
     * @return true if it's the end of the game.
     */
    boolean isOver();

    /**
     *
     * @return the board.
     */
    Square[][] getBoard();
    
    /**
     * selects the piece of the given row and column
     * @param row the row of the piece
     * @param column the column of the piece
     */
    void select(int row, int column);
    
    /**
     * 
     * @param row the row of the piece
     * @param col teh column of the piece
     * @return the piece of the given row and column
     */
    Piece getSelected(int row, int col);
    
    /**
     * 
     * @return returns the list of all the possible moves for the selected piece
     */
    List<Move> getMoves();
    
    
    /**
     * applies the move to the piece selected
     * @param move the move to do
     */
    void apply(Move move);

    /**
     * 
     * @return the player currently playing
     */
    Player getCurrent();
    
    /**
     * 
     * @param player the player
     * @return true if the player still has moves to do
     */
    boolean hasMoves(Player player);
    
    /**
     * 
     * @return a list of the winner(s)
     */
    List<Player> getWinners();

}