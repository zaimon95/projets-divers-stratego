/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.model;

import java.util.List;
/**
 *
 * @author simon
 */
public interface Model {

    /**
     * True when game is over. The game is over when the bag has less than 10
     * letters.
     *
     * @return true if game is over.
     */
    boolean isOver();

    /**
     * Starts the game. Picks 10 random letters from the bag.
     * 
     * @throws IllegalStateException if the bag is empty.
     */
    void start();

    /**
     * Gets the list of current letters from which player search for the best
     * word.
     *
     * @return the list of current letters.
     */
    List<Character> getPicked();

    /**
     * Returns the number of letters in the bag.
     *
     * @return the number of letters in the bag.
     */
    int getNbRemainingLetters();

    /**
     * Returns the score of the player. 1 point by letter.
     *
     * @return the score of the player.
     */
    int getScore();

    /**
     * A player proposes a word.
     *
     * @param word the word proposed by the player.
     *
     * @throws IllegalStateException if no letters are picked.
     *
     * @throws IllegalArgumentException if the word is empty or null.
     *
     * @throws IllegalArgumentException if the word is invalid.
     */
    void play(String word);
}

