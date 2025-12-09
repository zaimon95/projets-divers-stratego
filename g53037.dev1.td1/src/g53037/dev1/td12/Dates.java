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
public class Dates {

    static int compare(Date d1, Date d2){
        
        int compar = -1;
        
        if(d1.year == d2.year && d1.month == d2.month && d1.day == d2.day){
            compar = 0;
        }
        
        else if(d1.year > d2.year || 
                (d1.year == d2.year && d1.month > d2.month) ||
                (d1.year == d2.year && d1.month == d2.month && d1.day == d2.day)){
            compar = 1;
        }
        
        return compar;
    }
}
