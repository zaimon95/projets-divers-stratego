/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentacademy;

/**
 *
 * @author simon
 */
public class LoiNormale {
    
    public static void main(String[] args) {
        int nbEleves = 10;
        double note1 = 9;
        double note2 = 3;
        double note3 = 9;
        double note4 = 6;
        double note5 = 7;
        double note6 = 0;
        double note7 = 8;
        double note8 = 10;
        double note9 = 8;
        double note10 = 9;
        double [] notes = {note1, note2, note3, note4, note5, note6, note7, note8, note9, note10};
        System.out.println(moyenne(notes));
        System.out.println(ecartType(notes));
    }
    
    public static double  moyenne(double [] notes){
        double somme = 0;
        for(int i = 0; i < notes.length; i++){
            somme = somme + notes[i];
        }
        double moyenne = somme/notes.length;
        return moyenne;
    }
    
    public static double ecartType(double[] notes){
        int[] count = {0,0,0,0,0,0,0,0,0,0,0};
        double somme = 0;
        double sommeCarre = 0;
        double variance;
        for(int i = 0; i < notes.length; i++){
            somme = somme + notes[i];
            sommeCarre = sommeCarre + Math.pow(notes[i], 2);
        }
        variance = (sommeCarre/notes.length) - Math.pow(moyenne(notes), 2);
        double ecartType = Math.sqrt(variance);
        return ecartType;
    }
}
