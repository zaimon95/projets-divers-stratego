package g53037.stratego.controller;

import g53037.stratego.model.*;
import g53037.stratego.view.*;
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
     * @throws NullPointerException if one of the parameters is null
     */
    public Controller(Model game, View view) {
        if (game == null || view == null) {
            throw new NullPointerException();
        }
        this.game = game;
        this.view = view;
    }

    /**
     * initializes the game by calling the methods initialize() of his
     * attributes
     */
    public void initialize() {
        game.initialize();
        view.initialize();
    }

    /**
     * Permits the launching of a game. 1. verifie if the game can start; 2.
     * display the help of the game; 3. while the game is not over, display the
     * game board and ask th user to enter a command 4. Once done, the end of
     * the game is displayed. If the user enters the command "quit", a goodbye
     * message est shown on the screen and the program ends.
     */
    public void startGame() {
        initialize();
        game.start();
        view.displayHelpInit();
        view.displayBoard(game.getBoard(), game.getCurrent());
        while (!game.isOver()) {
            view.displayCurrentPlayer(game.getCurrent());
            String com = view.askCommand();
            if (com.equalsIgnoreCase("quit")) {
                view.displayOver(game.getWinners());
                System.exit(0);
            } else if (com.startsWith("select ")) {
                if ((isInteger(1, com) && isInteger(2, com))) {
                    int row = Integer.parseInt(com.split(" ")[1]);
                    int col = Integer.parseInt(com.split(" ")[2]);
                    try{
                        view.displaySelected(game.getSelected(row, col));
                    }
                    catch(IllegalStateException e){
                        view.displayError("la piece appartient au joueur adverse "
                                + "ou la case est vide");
                    }
                    view.displayHelpWhenSelected();
                    String com2 = view.askCommand();
                    if (com2.equalsIgnoreCase("moves")) {
                        view.displayMoves(game.getMoves());
                        if(!game.getMoves().isEmpty()){
                            view.displayHelpWhenMoves();
                            String com3 = view.askCommand();
                            if (com3.startsWith("apply ")) {
                                if (isInteger(1, com3)) {
                                    int num = Integer.parseInt(com3.split(" ")[1]);
                                    game.apply(game.getMoves().get(num));
                                    view.displayBoard(game.getBoard(), game.getCurrent());
                                } else {
                                    view.displayError("ce que vous avez introduit "
                                            + "n'est pas un entier");
                                }
                            }
                            else if(com3.equalsIgnoreCase("quit")){
                                view.displayOver(game.getWinners());
                                System.exit(0);
                            }
                            else {
                                view.displayError("la commande n'existe pas");
                                view.displayHelpInit();
                                view.displayBoard(game.getBoard(), game.getCurrent());
                            }
                        }
                        else{
                            view.displayBoard(game.getBoard(), game.getCurrent());
                        }
                    }
                    else if(com2.equalsIgnoreCase("quit")){
                        view.displayOver(game.getWinners());
                        System.exit(0);
                    }
                    else {
                        view.displayError("la commande n'existe pas");
                        view.displayHelpInit();
                        view.displayBoard(game.getBoard(), game.getCurrent());
                    }
                } else {
                    view.displayError("ce que vous avez introduit ne sont pas "
                            + "des entiers");
                }
            } else if (com.equalsIgnoreCase("moves")) {
                view.displayError("Vous n'avez pas selectionné de piece");

            } else if(com.equalsIgnoreCase("hint")){
                view.displayBoardHint(game.getBoard(), game.getCurrent());
            } else {
                view.displayError("la commande n'existe pas");
                view.displayHelpInit();
                view.displayBoard(game.getBoard(), game.getCurrent());
            }
        }
        view.displayOver(game.getWinners());
    }

    /**
     * verifies if the given substring is an integer
     * @param index the index of the substring to analyse
     * @param com the string to analyse
     * @return true if the substring is an integer, false otherwise
     */
    public boolean isInteger(int index, String com) {
        try {
            Integer.parseInt(com.split(" ")[index]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
