/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td12;

/**
 *
 * @author simon
 */
public class Moment {
    int heures;
    int minutes;
    int secondes;
    public Moment(int h, int m, int s){
        secondes = s;
        minutes = m;
        heures = h;
    }
    public String toString(){
        return String.format("%02d", heures) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", secondes); 
    }
    
}
