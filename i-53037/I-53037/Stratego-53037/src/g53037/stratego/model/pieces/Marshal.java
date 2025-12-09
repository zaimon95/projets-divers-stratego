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
public class Marshal extends Piece {
    
    
    public Marshal(PlayerColor color){
        super(10, color);
    }
    
    @Override
    public String toString() {
        String pion;
        if (this.color == PlayerColor.BLUE) {
            pion = ColorText.toBlue("MA");
        } else {
            pion = ColorText.toRed("MA");
        }
        return pion;
    }
    
    @Override
    public boolean isStronger(Piece other){
        boolean stronger = false;
        if(other instanceof Spy){
            stronger = false;
        } else if(super.isStronger(other)){
            stronger = true;
        }
        return stronger;
    }
    
}
