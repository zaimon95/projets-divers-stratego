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

public class Moments {
    
    static void addSecond(Moment m){
        
        if(m.secondes == 59 && m.minutes == 59){
            m.heures = m.heures + 1; 
        }
        
        else if(m.secondes == 59 && m.minutes != 59){
            m.minutes = m.minutes + 1;
        }
        
        else{
            m.secondes = m.secondes + 1;
        }
        
    }
    
}
