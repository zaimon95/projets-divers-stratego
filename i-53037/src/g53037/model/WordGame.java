/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simon
 */
public class WordGame implements Model {

    private Bag bag;
    private List<Character> picked = new ArrayList();
    private int score;

    public WordGame() {
        bag = new Bag();
        score = 0;
        picked = null;
    }

    @Override
    public boolean isOver() {
        return bag.size() <= 10;
    }

    @Override
    public void start() {
        if (bag.size() == 0) {
            throw new IllegalStateException("the bag is empty.");
        }
        bag.pickLetters(10);
    }

    @Override
    public List<Character> getPicked() {
        return bag.pickLetters(10);
    }

    @Override
    public int getNbRemainingLetters() {
        return bag.size();
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void play(String word) {
        List<Character> valid = new ArrayList();
        if (picked.isEmpty()) {
            throw new IllegalStateException("no letters are picked.");
        } else if (valid.isEmpty()) {
            throw new IllegalArgumentException("the word is empty or null");
        } else if (false) {
            throw new IllegalArgumentException("the word is invalid");
        }
        for (char c : word.toCharArray()) {
            if (picked.contains(c)) {
                valid.add(c);
                picked.remove(c);
            } else {
                for (Character character : valid) {
                    picked.add(character);
                    valid.clear();
                    throw new IllegalArgumentException("the characters from the word "
                            + "are not in the list of picked letters");
                }
            }
        }
        score = score + word.length();
        bag.add(picked);
        picked.clear();
    }
}
