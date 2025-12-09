/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author simon
 */
public class Bag {
    
    /**
     * bag of letters 
     */
    private List<Character> letters = new ArrayList();

    /**
     * default constructor that creates a bag with 5 'E' letters, 5 'T' letters, 
     * 5 'R' letters, 5 'A' letters, 5 'I' letters, 5 'N' letters and 5 'S' letters.
     */
    public Bag() {
        for (int i = 0; i < 5; i++) {
            letters.add('E');
            letters.add('T');
            letters.add('R');
            letters.add('A');
            letters.add('I');
            letters.add('N');
            letters.add('S');
        }
        Collections.shuffle(letters);
    }
    
    /**
     * another constructor that takes as parameter a list of characters and 
     * fills the bag with the letters given as parameter.
     * @param letters list of letters.
     */
    public Bag(List<Character> letters){
        this.letters = letters;
    }

    /**
     * 
     * @return the number of letters in the bag.
     */
    public int size(){
        return letters.size();
    }
    
    /**
     * 
     * @return the last letter of the bag
     * @throws IllegalStateException if the bag is empty.
     */
    public Character pickLetter(){
        if(letters.isEmpty()){
            throw new IllegalStateException("the bag is empty.");
        }
        return letters.get(letters.size());
    }
    
    /**
     * 
     * @param nb number of letters to pick
     * @return the List of the nb last letters.
     * @throws IllegalArgumentException if nb is negative
     */
    public List<Character> pickLetters(int nb){
        if(nb < 0){
            throw new IllegalArgumentException("nb is negative");
        }
        List<Character> playLetters = new ArrayList();
        for (int i = 0; i < nb; i++) {
            playLetters.add(letters.get(letters.size()-i));
        }
        return playLetters;
    }
    
    /**
     * 
     * @param letters list of letters not used during our turn
     * @throws IllegalArgumentException if the list is null or empty
     */
    public void add(List<Character> letters){
        if(letters == null || letters.isEmpty()){
            throw new IllegalArgumentException("the list is null or empty");
        }
        for (Character letter : letters) {
            this.letters.add(letter);
        }
    }

    public List<Character> getLetters() {
        return letters;
    }
    
}
