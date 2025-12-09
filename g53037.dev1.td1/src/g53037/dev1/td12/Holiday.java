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
public class Holiday {
    Date date;
    String label;
    public Holiday(Date d, String l){
        date = d;
        label = l;
    }
    public String toString(){
        return label + " le " + date;
    }
}
