package g53037.stratego;

import g53037.stratego.controller.*;
import g53037.stratego.model.*;
import g53037.stratego.view.*;

/**
 *
 * @author simon
 */
public class Main {

    /**
     * runs the game and allows the game to be seen
     *
     * @param args
     */
    public static void main(String[] args) {
        Model game = new Game();
        View view = new View();
        Controller controller = new Controller(game, view);
        controller.startGame();
    }
}
