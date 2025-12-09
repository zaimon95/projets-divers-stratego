/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.stratego.model;

/**
 *
 * @author g53037
 */
public class MagicSquare extends Square{
    
    public MagicSquare(SquareType type){
        super(type);
    }
    
    public void put(Piece piece) {
        super.put(piece);
        piece.setRank(piece.getRank() + 1);
    }
}
