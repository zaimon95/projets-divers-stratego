package g53037.stratego.view;

import java.util.Scanner;
import g53037.stratego.model.*;
import static g53037.stratego.model.PlayerColor.*;
import static g53037.stratego.model.SquareType.*;
import g53037.stratego.model.pieces.*;
import java.util.List;

/**
 *
 * @author simon
 */
public class View {

    /**
     * allows to obtain the information of the users.
     */
    private final Scanner in;

    /**
     * allows to initialize the attribute of the class
     */
    public View() {
        this.in = new Scanner(System.in);
    }

    /**
     * displays a welcome message to the user
     */
    public void initialize() {
        System.out.println("");
        System.out.println("Owayo!!!!! Stratego e yōkoso :) (traduction: Bonjour!!! Bienvenue dans Stratego :) )");
        System.out.println("");
    }

    /**
     * displays a goodbye message to the user
     */
    public void quit() {
        System.out.println("Sayonara!!!");
        System.out.println("");
    }

    /**
     * displays the message given as parameter to the user
     *
     * @param message message to display
     */
    public void displayError(String message) {
        System.out.println(message);
        System.out.println("");
    }

    /**
     * displays the list of commands that the user can encode at the start of
     * the game
     */
    public void displayHelpInit() {
        System.out.println("Liste des commandes : ");
        System.out.println(" * select <ligne> <colonne> : permet de séléctionner la "
                + "pièce à la position mentionnée");
        System.out.println(" * hint : permet de savoir si les pieces adverses sont "
                + "possiblement des drapeaux ou pas (si ce sont des drapeaux"
                + " potentiels, il sera noté \"DP\" sinon il sera noté"
                + "\"PE\"");
        System.out.println(" * quit : permet de quitter le jeu");
        System.out.println("");
    }

    /**
     * displays the list of commands that the user can encode when the last
     * command was select <ligne> <colonne>
     */
    public void displayHelpWhenSelected() {
        System.out.println("Liste des commandes : ");
        System.out.println(" * moves : affiche la liste des mouvements possibles de"
                + " la piece à la position selectionée");
        System.out.println(" * quit : permet de quitter le jeu");
        System.out.println("");
    }

    /**
     * displays the list of commands that the user can encode when the last
     * command was moves
     */
    public void displayHelpWhenMoves() {
        System.out.println("Liste des commandes : ");
        System.out.println(" * apply <numero du déplacement> : "
                + "permet de déplacer une pièce sélectionnée");
        System.out.println(" * quit : permet de quitter le jeu");
        System.out.println("");
    }

    /**
     * displays a message asking the user to enter a command
     *
     * @return the user-encoded text within the console
     */
    public String askCommand() {
        System.out.print("Entrez votre commande : ");
        String commande = in.nextLine();
        System.out.println("");
        return commande;
    }

    /**
     * allows to display the game board to the user
     *
     * @param squares a 2 dimension tabulation of squares of 5 rows and 4
     * columns
     * @param player 
     */
    public void displayBoard(Square[][] squares, Player player) {
        System.out.println(" col#\t||  | 00 |  | 01 |  | 02 |  | 03 |  | 04 |");
        System.out.println("==================================================");
        for (int i = 0; i < squares.length; i++) {
            System.out.print("row#0" + i + "\t|| ");
            for (Square square : squares[i]) {
                if(player.getColor() == RED){
                    System.out.print(" | ");
                    if (square.getPiece() instanceof Flag) {
                        displayPieceRED(square, "DR", "PE");
                    } else if (square.getPiece() instanceof General) {
                        displayPieceRED(square, "GE", "PE");
                    } else if (square.getPiece() instanceof Bomb) {
                        displayPieceRED(square, "BO", "PE");
                    } else if (square.getPiece() instanceof Miner) {
                        displayPieceRED(square, "DE", "PE");
                    } else if (square.getPiece() instanceof Spy) {
                        displayPieceRED(square, "ES", "PE");
                    } else if (square.getPiece() instanceof Marshal) {
                        displayPieceRED(square, "MA", "PE");
                    } else if (square.getPiece() instanceof Scout) {
                        displayPieceRED(square, "EC", "PE");
                    } else if (square.getPiece() == null) {
                        if (square instanceof MagicSquare && square.isLand()) {
                            System.out.print(ColorText.bgtoGreen("  "));
                        } else if (!square.isLand()) {
                            System.out.print(ColorText.bgtoBlue("  "));
                        }else if(!(square instanceof MagicSquare) && square.isLand()){
                            System.out.print(ColorText.bgtoGrey("  "));
                        }
                    }
                    System.out.print(" | ");
                }else if(player.getColor() == BLUE){
                    System.out.print(" | ");
                    if (square.getPiece() instanceof Flag) {
                        displayPieceBLUE(square, "DR", "PE");
                    } else if (square.getPiece() instanceof General) {
                        displayPieceBLUE(square, "GE", "PE");
                    } else if (square.getPiece() instanceof Bomb) {
                        displayPieceBLUE(square, "BO", "PE");
                    } else if (square.getPiece() instanceof Miner) {
                        displayPieceBLUE(square, "DE", "PE");
                    } else if (square.getPiece() instanceof Spy) {
                        displayPieceBLUE(square, "ES", "PE");
                    } else if (square.getPiece() instanceof Marshal) {
                        displayPieceBLUE(square, "MA", "PE");
                    } else if (square.getPiece() instanceof Scout) {
                        displayPieceBLUE(square, "EC", "PE");
                    } else if (square.getPiece() == null) {
                        if (square instanceof MagicSquare && square.isLand()) {
                            System.out.print(ColorText.bgtoGreen("  "));
                        } else if (!square.isLand()) {
                            System.out.print(ColorText.bgtoBlue("  "));
                        }else if(!(square instanceof MagicSquare) && square.isLand()){
                            System.out.print(ColorText.bgtoGrey("  "));
                        }
                    }
                    System.out.print(" | ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void displayBoardHint(Square[][] squares, Player player) {
        System.out.println(" col#\t||  | 00 |  | 01 |  | 02 |  | 03 |  | 04 |");
        System.out.println("==================================================");
        for (int i = 0; i < squares.length; i++) {
            System.out.print("row#0" + i + "\t|| ");
            for (Square square : squares[i]) {
                if(player.getColor() == RED){
                    System.out.print(" | ");
                    if (square.getPiece() instanceof Flag) {
                        displayPieceHintRED(square, "DR", "PE", "DP", RED, BLUE);
                    } else if (square.getPiece() instanceof General) {
                        displayPieceHintRED(square, "GE", "PE", "DP", RED, BLUE);
                    } else if (square.getPiece() instanceof Bomb) {
                        displayPieceHintRED(square, "BO", "PE", "DP", RED, BLUE);
                    } else if (square.getPiece() instanceof Miner) {
                        displayPieceHintRED(square, "DE", "PE", "DP", RED, BLUE);
                    } else if (square.getPiece() instanceof Spy) {
                        displayPieceHintRED(square, "ES", "PE", "DP", RED, BLUE);
                    } else if (square.getPiece() instanceof Marshal) {
                        displayPieceHintRED(square, "MA", "PE", "DP", RED, BLUE);
                    } else if (square.getPiece() instanceof Scout) {
                        displayPieceHintRED(square, "EC", "PE", "DP", RED, BLUE);
                    } else if (square.getPiece() == null) {
                        if (square instanceof MagicSquare && square.isLand()) {
                            System.out.print(ColorText.bgtoGreen("  "));
                        } else if (!square.isLand()) {
                            System.out.print(ColorText.bgtoBlue("  "));
                        }else if(!(square instanceof MagicSquare) && square.isLand()){
                            System.out.print(ColorText.bgtoGrey("  "));
                        }
                    }
                    System.out.print(" | ");
                }else if(player.getColor() == BLUE){
                    System.out.print(" | ");
                    if (square.getPiece() instanceof Flag) {
                        displayPieceHintBLUE(square, "DR", "PE", "DP", BLUE, RED);
                    } else if (square.getPiece() instanceof General) {
                        displayPieceHintBLUE(square, "GE", "PE", "DP", BLUE, RED);
                    } else if (square.getPiece() instanceof Bomb) {
                        displayPieceHintBLUE(square, "BO", "PE", "DP", BLUE, RED);
                    } else if (square.getPiece() instanceof Miner) {
                        displayPieceHintBLUE(square, "DE", "PE", "DP", BLUE, RED);
                    } else if (square.getPiece() instanceof Spy) {
                        displayPieceHintBLUE(square, "ES", "PE", "DP", BLUE, RED);
                    } else if (square.getPiece() instanceof Marshal) {
                        displayPieceHintBLUE(square, "MA", "PE", "DP", BLUE, RED);
                    } else if (square.getPiece() instanceof Scout) {
                        displayPieceHintBLUE(square, "EC", "PE", "DP", BLUE, RED);
                    } else if (square.getPiece() == null) {
                        if (square instanceof MagicSquare && square.isLand()) {
                            System.out.print(ColorText.bgtoGreen("  "));
                        } else if (!square.isLand()) {
                            System.out.print(ColorText.bgtoBlue("  "));
                        }else if(!(square instanceof MagicSquare) && square.isLand()){
                            System.out.print(ColorText.bgtoGrey("  "));
                        }
                    }
                    System.out.print(" | ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    private void displayPieceHintRED(Square square, String a, String b, String c, PlayerColor color, PlayerColor color2){
        if (square.getPiece().getColor() == color2 && square.getPiece().isFlagLike() == false && !(square instanceof MagicSquare)) {
            System.out.print(ColorText.bgtoGrey(ColorText.toBlue(b)));
        } else if(square.getPiece().getColor() == color2 && square.getPiece().isFlagLike() == false && square instanceof MagicSquare){
            System.out.print(ColorText.bgtoGreen(ColorText.toBlue(b)));
        } else if(square.getPiece().getColor() == color2 && square.getPiece().isFlagLike() == true && !(square instanceof MagicSquare)){
            System.out.print(ColorText.bgtoGrey(ColorText.toBlue(c)));
        } else if(square.getPiece().getColor() == color2 && square.getPiece().isFlagLike() == true && square instanceof MagicSquare){
            System.out.print(ColorText.bgtoGreen(ColorText.toBlue(c)));
        } else if (square.getPiece().getColor() == color && !(square instanceof MagicSquare)) {
            System.out.print(ColorText.bgtoGrey(ColorText.toRed(a)));
        } else if (square.getPiece().getColor() == color && square instanceof MagicSquare) {
            System.out.print(ColorText.bgtoGreen(ColorText.toRed(a)));
        }
    }
    
    private void displayPieceHintBLUE(Square square, String a, String b, String c, PlayerColor color, PlayerColor color2){
        if (square.getPiece().getColor() == color2 && square.getPiece().isFlagLike() == false && !(square instanceof MagicSquare)) {
            System.out.print(ColorText.bgtoGrey(ColorText.toRed(b)));
        } else if(square.getPiece().getColor() == color2 && square.getPiece().isFlagLike() == false && square instanceof MagicSquare){
            System.out.print(ColorText.bgtoGreen(ColorText.toRed(b)));
        } else if(square.getPiece().getColor() == color2 && square.getPiece().isFlagLike() == true && !(square instanceof MagicSquare)){
            System.out.print(ColorText.bgtoGrey(ColorText.toRed(c)));
        } else if(square.getPiece().getColor() == color2 && square.getPiece().isFlagLike() == true && square instanceof MagicSquare){
            System.out.print(ColorText.bgtoGreen(ColorText.toRed(c)));
        } else if (square.getPiece().getColor() == color && !(square instanceof MagicSquare)) {
            System.out.print(ColorText.bgtoGrey(ColorText.toBlue(a)));
        } else if (square.getPiece().getColor() == color && square instanceof MagicSquare) {
            System.out.print(ColorText.bgtoGreen(ColorText.toBlue(a)));
        }
    }
    
    private void displayPieceRED(Square square, String a, String b){
        if (square.getPiece().getColor() == BLUE && !(square instanceof MagicSquare)) {
            System.out.print(ColorText.bgtoGrey(ColorText.toBlue(b)));
        } else if(square.getPiece().getColor() == BLUE && square instanceof MagicSquare){
            System.out.print(ColorText.bgtoGreen(ColorText.toBlue(b)));
        } else if (square.getPiece().getColor() == RED && !(square instanceof MagicSquare)) {
            System.out.print(ColorText.bgtoGrey(ColorText.toRed(a)));
        } else if (square.getPiece().getColor() == RED && square instanceof MagicSquare) {
            System.out.print(ColorText.bgtoGreen(ColorText.toRed(a)));
        }
    }

    
    private void displayPieceBLUE(Square square, String a, String b){
        if (square.getPiece().getColor() == RED && !(square instanceof MagicSquare)) {
            System.out.print(ColorText.bgtoGrey(ColorText.toRed(b)));
        } else if(square.getPiece().getColor() == RED && square instanceof MagicSquare){
            System.out.print(ColorText.bgtoGreen(ColorText.toRed(b)));
        } else if (square.getPiece().getColor() == BLUE && !(square instanceof MagicSquare)) {
            System.out.print(ColorText.bgtoGrey(ColorText.toBlue(a)));
        } else if (square.getPiece().getColor() == BLUE && square instanceof MagicSquare) {
            System.out.print(ColorText.bgtoGreen(ColorText.toBlue(a)));
        }
    }
    
    /**
     * Allows you to show the user that the game is over
     *
     * @param winners
     */
    public void displayOver(List<Player> winners) {
        for (Player winner : winners) {
            if (winner.getColor() == RED) {
                System.out.println("Félicitations au " + ColorText.toRed("Joueur Rouge") + " vous avez gagné !!!");
            } else if (winner.getColor() == BLUE) {
                System.out.println("Félicitations au " + ColorText.toBlue("Joueur Bleu") + " vous avez gagné !!!");
            }
        }
        System.out.println("");
        quit();
    }

    /**
     * displays the piece given as parameter
     *
     * @param piece piece to display
     */
    public void displaySelected(Piece piece) {
        if (piece instanceof Flag) {
            if (piece.getColor() == RED) {
                System.out.println(ColorText.toRed("Drapeau Rouge") + " sélectionné");
            } else if (piece.getColor() == BLUE) {
                System.out.println(ColorText.toBlue("Drapeau Bleu") + " sélectionné");
            }
        } else if (piece instanceof General) {
            if (piece.getColor() == RED) {
                System.out.println(ColorText.toRed("Général Rouge") + " sélectionné");
            } else if (piece.getColor() == BLUE) {
                System.out.println(ColorText.toBlue("Général Bleu") + " sélectionné");
            }
        } else if (piece instanceof Bomb) {
            if (piece.getColor() == RED) {
                System.out.println(ColorText.toRed("Bombe Rouge") + " sélectionné");
            } else if (piece.getColor() == BLUE) {
                System.out.println(ColorText.toBlue("Bombe Bleue") + " sélectionné");
            }
        } else if (piece instanceof Miner) {
            if (piece.getColor() == RED) {
                System.out.println(ColorText.toRed("Démineur Rouge") + " sélectionné");
            } else if (piece.getColor() == BLUE) {
                System.out.println(ColorText.toBlue("Démineur Bleu") + " sélectionné");
            }
        } else if (piece instanceof Spy) {
            if (piece.getColor() == RED) {
                System.out.println(ColorText.toRed("Espion Rouge") + " sélectionné");
            } else if (piece.getColor() == BLUE) {
                System.out.println(ColorText.toBlue("Espion Bleu") + " sélectionné");
            }
        } else if (piece instanceof Marshal) {
            if (piece.getColor() == RED) {
                System.out.println(ColorText.toRed("Maréchal Rouge") + " sélectionné");
            } else if (piece.getColor() == BLUE) {
                System.out.println(ColorText.toBlue("Maréchal Bleu") + " sélectionné");
            }
        } else if (piece instanceof Scout) {
            if (piece.getColor() == RED) {
                System.out.println(ColorText.toRed("Éclaireur Rouge") + " sélectionné");
            } else if (piece.getColor() == BLUE) {
                System.out.println(ColorText.toBlue("Éclaireur Bleu") + " sélectionné");
            }
        }
        System.out.println("");
    }

    /**
     * displays the list of moves given as parameter
     *
     * @param moves list of moves to display
     */
    public void displayMoves(List<Move> moves) {
        System.out.println(moves.size() + " mouvement(s) possible(s)");
        for (int i = 0; i < moves.size(); i++) {
            if (moves.get(i).getPiece() instanceof Flag) {
                if (moves.get(i).getPiece().getColor() == RED) {
                    System.out.println(i + " - " + ColorText.toRed("Drapeau Rouge") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                } else if (moves.get(i).getPiece().getColor() == BLUE) {
                    System.out.println(i + " - " + ColorText.toBlue("Drapeau Bleu") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                }
            } else if (moves.get(i).getPiece() instanceof General) {
                if (moves.get(i).getPiece().getColor() == RED) {
                    System.out.println(i + " - " + ColorText.toRed("Général Rouge") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                } else if (moves.get(i).getPiece().getColor() == BLUE) {
                    System.out.println(i + " - " + ColorText.toBlue("Général Bleu") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                }
            } else if (moves.get(i).getPiece() instanceof Bomb) {
                if (moves.get(i).getPiece().getColor() == RED) {
                    System.out.println(i + " - " + ColorText.toRed("Bombe Rouge") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                } else if (moves.get(i).getPiece().getColor() == BLUE) {
                    System.out.println(i + " - " + ColorText.toBlue("Bombe Bleue") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                }
            } else if (moves.get(i).getPiece() instanceof Miner) {
                if (moves.get(i).getPiece().getColor() == RED) {
                    System.out.println(i + " - " + ColorText.toRed("Démineur Rouge") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                } else if (moves.get(i).getPiece().getColor() == BLUE) {
                    System.out.println(i + " - " + ColorText.toBlue("Démineur Bleu") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                }
            } else if (moves.get(i).getPiece() instanceof Spy) {
                if (moves.get(i).getPiece().getColor() == RED) {
                    System.out.println(i + " - " + ColorText.toRed("Espion Rouge") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                } else if (moves.get(i).getPiece().getColor() == BLUE) {
                    System.out.println(i + " - " + ColorText.toBlue("Espion Bleu") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                }
            } else if (moves.get(i).getPiece() instanceof Marshal) {
                if (moves.get(i).getPiece().getColor() == RED) {
                    System.out.println(i + " - " + ColorText.toRed("Maréchal Rouge") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                } else if (moves.get(i).getPiece().getColor() == BLUE) {
                    System.out.println(i + " - " + ColorText.toBlue("Maréchal Bleu") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                }
            } else if (moves.get(i).getPiece() instanceof Scout) {
                if (moves.get(i).getPiece().getColor() == RED) {
                    System.out.println(i + " - " + ColorText.toRed("Éclaireur Rouge") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                } else if (moves.get(i).getPiece().getColor() == BLUE) {
                    System.out.println(i + " - " + ColorText.toBlue("Éclaireur Bleu") + " peut se déplacer "
                            + "vers la ligne "
                            + moves.get(i).getEnd().getRow() + " et la colonne "
                            + moves.get(i).getEnd().getColumn());
                }
            }
        }
        System.out.println("");
    }

    /**
     * displays the player that is currently playing
     *
     * @param player player that is currently playing
     */
    public void displayCurrentPlayer(Player player) {
        if (player.getColor() == RED) {
            System.out.println("À votre tour Joueur Rouge");
        } else if (player.getColor() == BLUE) {
            System.out.println("À votre tour Joueur Bleu");
        }
        System.out.println("");
    }
}
