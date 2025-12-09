/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06;

/**
 *
 * @author simon
 */
public class ChaineUtil {
    public static void main(String[] args) {
        System.out.println(premièreLettre("Java"));
        System.out.println(dernièreLettre("Java"));
        System.out.println(nbVoy("Programmation"));
        System.out.println(nbCon("Programmation"));
        System.out.println(estPalindrome("kayak"));
    }
    static char premièreLettre(String mot){
        return mot.charAt(0);
    }
    static char dernièreLettre(String mot){
        return mot.charAt(mot.length()-1);
    }
    static int nbVoy(String mot){
        String voy = "aeiouy";
        String min = mot.toLowerCase();
        int count = 0;
        for (int i = 0; i < min.length(); i++) {
            for (int j = 0; j < voy.length(); j++) {
                if(mot.charAt(i) == voy.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    static int nbCon(String mot){
        return mot.length()-nbVoy(mot);
    }
    static boolean estPalindrome(String mot){
        boolean pal = false;
        for (int i = 0; i < mot.length()/2; i++) {
            if(mot.charAt(i) == mot.charAt(mot.length()-i-1)){
                pal = true;
            }
        }
        return pal;
    }
}
