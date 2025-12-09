/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.view;

import g53037.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author simon
 */
public class View {
    /**
     * the input word of the player
     */
    private final Scanner input;

    /**
     * initializes the attribute of the class
     */
    public View() {
        input = new Scanner(System.in);
    }
    
    /**
     * asks a word to the player
     * @return the word
     */
    public String askWord(){
        System.out.print("Entrez votre mot : ");
        String word = input.nextLine();
        System.out.println("");
        return word;
    }
    
    /**
     * displays the number of letters contained in the bag
     */
    public void displayBag(){
        WordGame bag = new WordGame();
        System.out.println("Il reste " + bag.getNbRemainingLetters() + "lettres dans le sac");
    }
    
    /**
     * displays the letters randomly drawn given as parameter
     * @param picked the letters drawn
     */
    public void displayLetters(List<Character> picked){
        WordGame bag = new WordGame();
        picked = new ArrayList();
        for (Character character : picked) {
            System.out.println(character + "\t");
        }
    }
    
    /**
     * displays the score of the player.
     */
    public void displayScore(){
        WordGame bag = new WordGame();
        System.out.println(bag.getScore());
    }
    
    /**
     * displays the error message given as parameter
     * @param message message o display
     */
    public void displayError(String message){
        System.out.println(message);
        System.out.println("");
    }
}
