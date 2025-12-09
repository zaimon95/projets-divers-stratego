/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;
import java.util.*;
/**
 *
 * @author simon
 */
public class Calendrier {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        int mois = saisieEntier("Entrez le mois : ", 0, 12);
        int année = saisieEntier("Entrez l'année : ", 0);
        afficherTitre(mois, année);
        afficherEntête();
        afficherMois(numéroJour(1, mois, année), nombreJours(mois, année));
    }
    /**
     * 
     * @param mois
     * @return the name of the month which has the number you gave
     */
    static String nomMois(int mois){
        String nom;
        switch(mois) { 
            case 1 : 
                nom = "Janvier";
                break;
            case 2 : 
                nom = "Février";
                break;
            case 3 : 
                nom = "Mars";
                break;
            case 4 :
                nom = "Avril";
                break;
            case 5 : 
                nom = "Mai";
                break;
            case 6 : 
                nom = "Juin";
                break;
            case 7 : 
                nom = "Juillet";
                break;
            case 8 :
                nom = "Août";
                break;
            case 9 :
                nom = "Septembre";
                break;
            case 10 : 
                nom = "Octobre";
                break;
            case 11 :
                nom = "Novembre";
                break;
            case 12 :
                nom = "Décembre";
                break;
            default:
                throw new IllegalArgumentException("Numéro du mois impossible " + mois);

        }
        return nom;
    }
    /**
     * prints the name of the month and the number of the year
     * @param mois
     * @param année 
     */
    static void afficherTitre(int mois, int année){
        System.out.println("==================================================");
        String titre = nomMois(mois) + " " + année;
        for(int i = 0; i < 25 - titre.length()/2; i++){
            System.out.print(" ");
        }
        System.out.println(titre);
        System.out.println("==================================================");
    }
    /**
     * prints the days of the week in a calendar format (the 2 first letters
     * of the day)
     */
    static void afficherEntête(){
        System.out.println("Lu\tMa\tMe\tJe\tVe\tSa\tDi");
        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––");
    }
    /**
     * prints the days of the month under each day of the week with the correct
     * offset
     * @param décalage offset (represents the position of the first day of the 
     * month in a week)
     * @param nombreJours number of days in the month
     */
    static void afficherMois(int décalage, int nombreJours){
        for (int i = 0; i < décalage; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= nombreJours; i++) {
            System.out.print(String.format("%02d", i) + "\t");
            if((i+décalage)%7 == 0){
                System.out.println("");
            }
        }
        System.out.println("");
    }
    /**
     * 
     * @param année number of the year
     * @return true if the year is bissextile (if it is a multiple of 4 
     * and no multiple of 100 or if it is a multiple of 400)
     */
    public static boolean estBissextile(int année){
        if((année % 4 == 0 && année % 100 != 0) || année % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * 
     * @param mois number of the month
     * @param année number of the year
     * @return the number of days for each month
     */
    public static int nombreJours(int mois, int année){
        int nb = 0;
        if(mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12){
            nb = 31;
        }
        else if(mois == 4 || mois == 6 || mois == 9 || mois == 11){
            nb = 30;
        }
        else if(mois == 2 && estBissextile(année) == true){
            nb = 29;
        }
        else if(mois == 2 && estBissextile(année) == false){
            nb = 28;
        }
        return nb;
    }
    /**
     * 
     * @param jour number of the day we look for
     * @param mois number of the month
     * @param année représente l'année
     * @return the place of the day in the week for a given day of the month
     */
    public static int numéroJour(int jour, int mois, int année){
        if(mois == 1 || mois == 2){
            mois += 12;
            année -= 1;
        }
        int j = année/100;
        int k = année%100;
        int décalage = (1 + ((mois+1)*13)/5 + k + k/4 + j/4 + 5*j + 5)%7;
        return décalage;
    }
    /**
     * 
     * @param message an error message
     * @return a message if the number given by the user is not an Integer and lets the user retry
     */
    public static int saisieEntier(String message){
        Scanner cl = new Scanner(System.in);
        System.out.print(message);
        while(!cl.hasNextInt()){
            cl.next();
            System.out.println("le nombre n'est pas entier");
            System.out.print(message);
        }
        return cl.nextInt();
    }
    /**
     * 
     * @param message an error message
     * @param min a minimum value 
     * @param max a maximum value
     * @return a message if the number is over the max value or under the min value and lets the user retry
     */
    public static int saisieEntier(String message, int min, int max){
        int a = saisieEntier(message);
        while(a > max || a < min){
            System.out.println("l'entrée donnée n'est pas un entier compris entre " + min + " et " + max);
            a = saisieEntier(message);
        }
        return a;
    }
    /**
     * 
     * @param message an error message
     * @param min a minimum value
     * @return a message if the number is over the max value and lets the user retry 
     */
    public static int saisieEntier(String message, int min){
        int a = saisieEntier(message);
        while(a < min){
            System.out.println("l'entrée donnée n'est pas un entier positif");
            a = saisieEntier(message);
        }
        return a;
    }

}
