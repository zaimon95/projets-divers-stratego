/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11;
import esi.dev1.util.Dictionnaire;
import java.util.*;
/**
 *
 * @author simon
 */
public class LeMotLePlusLong {
    public static void main(String[] args) {
        char[] lettres = demanderLettres();
        String mot = demanderMot();
        String best = meilleurMot(lettres);
        System.out.println(best);
    }
    
    /**
     * 
     * @param min minimum value
     * @param max maximum value
     * @return a number between min and max
     */
    static int tirerHasard(int min, int max){
        int nb = (int) (min + Math.random() * (max-min+1));
        return nb;
    }
    /**
     * 
     * @return a random vowel
     */
    static char tirerVoyelle(){
        char[] voy = {'A', 'E', 'I', 'O', 'U', 'Y'};
        int rnd = tirerHasard(0, voy.length-1);
        char voyelle = voy[rnd];
        return voyelle;
    }
    /**
     * 
     * @return a random consonant
     */
    static char tirerConsonne(){
        char[] cons = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
            'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};
        int rnd = tirerHasard(0, cons.length-1);
        char consonne = cons[rnd];
        return consonne;
    }
    /**
     * prints the letters
     * @param letters a tabulation of 9 lettres
     */
    static void afficherLettres(char[] lettres){
        for (char lettre : lettres) {
            System.out.print(lettre + " ");
        }
        System.out.println("");
    }
    /**
     * Asks the user if he wants a vowel or a consonant. 
     * If the user enters 1, he will have a vowel.
     * If he enters 2, he will have a consonant.
     * prints the already drawn letters and asks 9 times.
     * 
     * @return a tabulation of 9 characters
     */
    static char[] demanderLettres(){
        char[] lettres = new char[9];
        for (int i = 0; i < lettres.length; i++) {
            afficherLettres(lettres);
            int choix = saisieEntier("Pour tirer une voyelle, appuyez sur 1. Pour tirer une consonne, sur 2 : ", 1, 2);
            if(choix == 1){
                char lettre = tirerVoyelle();
                lettres[i] = lettre;
            }
            else if(choix == 2){
                char lettre = tirerConsonne();
                lettres[i] = lettre;
            }
        }
        afficherLettres(lettres);
        return lettres;
    }
    /**
     * 
     * @return the longest word the user found
     */
    static String demanderMot(){
        Scanner cl = new Scanner(System.in);
        System.out.println("Entrez le mot le plus long que vous avez trouvé");
        return cl.nextLine().toUpperCase();
    }
    /**
     * 
     * @param lettres a tabulation of the drawn letters
     * @param mot the word introduced by the user
     * @return true if all the letters from mot are included in lettres
     */
    static boolean vérifierLettres(char[] lettres, String mot){
        boolean estOK = true;
        char[] copie = copie(lettres);
        for (int i = 0; i < mot.length(); i++) {
            if (estOK) {
                char lettre = mot.charAt(i);
                estOK = estDedans(lettre, copie);
            }
        }
        return estOK;
    }
    static boolean estDedans(char lettre, char[] lettres){
        boolean ok = false;
        int i = 0;
        while(i < lettres.length){
            if(Character.toUpperCase(lettre) == Character.toUpperCase(lettres[i])){
                lettres[i] = ' ';
                ok = true;
            }
            i++;
        }
        return ok;
    }
    /**
     * 
     * @param lettres
     * @return 
     */
    static char[] copie(char[] lettres){
        char[] copie = new char[lettres.length];
        System.arraycopy(lettres, 0, copie, 0, lettres.length);
        return copie;
    }
    static boolean dansDico(String mot){
        String[] dico = Dictionnaire.mots();
        boolean existe = false;
        String maj = mot.toUpperCase();
        for (String word : dico) {
            if (!existe) {
                existe = maj.equals(word);
            }
        }
        return existe;
    }
    static String meilleurMot(char[] lettres){
        String[] dico = Dictionnaire.mots();
        String mot = "";
        for (int i = 0; i < dico.length; i++) {
            boolean existe = vérifierLettres(lettres, dico[i]);
            if(existe && mot.length() < dico[i].length()){
                mot = dico[i];
            }
        }
        return mot;
    }
    /**
     * 
     * @param message an error message
     * @return the number you entered.
     * <p> 
     * if it is not an integer, prints message and lets you try again
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
     * @return the number you entered which has to be between min and max. 
     * <p> 
     * if it is not an integer or if the number is smaller than min or greater than max, prints message and lets you try again
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
     * @return the number you entered which has to be greater than min. 
     * <p> 
     * if it is not an integer or if the number is smaller than min, prints message and lets you try again
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
