/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.controller;

import g53037.model.Model;
import g53037.view.View;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simon
 */
public class Controller {
    /**
     * the instance of the game to work on
     */
    private Model game;

    /**
     * the view of the game
     */
    private View view;

    /**
     * allows initializing the attributes of the class.
     *
     * @param game the instance of the game to work on
     * @param view the view of the game
     */
    public Controller(Model game, View view) {

        this.game = game;
        this.view = view;
    }
    
    public void start(){
        while(!game.isOver()){
            view.displayBag();
            List<Character> picked = new ArrayList();
            picked = game.getPicked();
            view.displayLetters(picked);
            String word = view.askWord();
            game.play(word);
        }
    }
}
