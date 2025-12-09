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
public class Date {
    int day;
    int month;
    int year;
    public Date(int jour, int mois, int année){
        day = jour;
        month = mois;
        year = année;
    }
    public String toString(){
        return String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + String.format("%02d", year);
    }
}
