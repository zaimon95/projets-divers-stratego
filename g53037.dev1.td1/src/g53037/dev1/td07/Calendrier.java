/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td07;
import java.util.*;

/**
 *
 * @author simon
 */
public class Calendrier {

    public static void main(String[] args) {
        int mois = saisieEntier("Entrez le mois : ", 0, 12);
        int année = saisieEntier("Entrez l'année : ", 0);
        afficherTitre(mois, année);
        afficherEntête();
        afficherMois(numéroJour(1, mois, année), nombreJours(mois, année));
        
    }
    
    /**
     * 
     * @param mois un nombre qui représente le mois
     * @return the name of the corresponding month
     * 
     */
    public static String nomMois(int mois){
        String[] month = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
        return month[mois-1];
        
    }
    
    /**
     * 
     * @param mois un nombre qui représente le mois
     * @param année représente l'année
     * print a title with the name of the month and the year the user gives 
     */
    public static void afficherTitre(int mois, int année){
        System.out.println("==================================================");
        String titre = nomMois(mois) + " " + année;
        for(int i = 0; i < 25 - titre.length()/2; i++){
            System.out.print(" ");
        }
        System.out.println(titre);
        System.out.println("==================================================");
    }
    
    /**
     * print a week
     */
    public static void afficherEntête(){
        System.out.println("Lu\tMa\tMe\tJe\tVe\tSa\tDi");
        System.out.println("__________________________________________________");
    }
    /**
     * 
     * @param décalage un nombre qui réprésente le décalage d'un jour du mois
     * @param nombreJours un nombre qui représente le nombre de jours dans un mois
     * print the number of days in each month like a calendar. Begins with décalage 
     */
    public static void afficherMois(int décalage, int nombreJours){
        for(int i = 0; i < décalage; i++){
            System.out.print("\t");
        }
        for(int j = 1; j <= nombreJours; j++){      
            System.out.print(String.format("%02d", j) + "\t");
            if((j+décalage)%7 == 0){
                System.out.println("");
            }
        }
        System.out.println("");
    }
    /**
     * 
     * @param année représente l'année
     * @return if the year is bissextile or not
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
     * @param mois un nombre qui représente le mois
     * @param année représente l'année
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
     * @param jour représente le jour du mois qu'on recherche
     * @param mois un nombre qui représente le mois
     * @param année représente l'année
     * @return the place of the day of the week for a given day of the month
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
     * @param message un message d'erreur
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
     * @param message un message d'erreur
     * @param min une valeur min 
     * @param max une valeur max
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
     * @param message un message d'erreur
     * @param min une valeur min
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
