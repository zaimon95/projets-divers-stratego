/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.stratego.model.pieces;

import g53037.stratego.model.Piece;
import g53037.stratego.model.PlayerColor;
import g53037.stratego.view.ColorText;

/**
 *
 * @author simon
 */
public class Scout extends Piece{
    
    public Scout(PlayerColor color){
        super(2, 2, color);
    }
    
    @Override
    public String toString() {
        String pion;
        if (this.color == PlayerColor.BLUE) {
            pion = ColorText.toBlue("EC");
        } else {
            pion = ColorText.toRed("EC");
        }
        return pion;
    }
}
