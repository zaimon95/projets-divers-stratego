/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author g53037
 */
public class Memory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    /**
     * 
     * @param memory tableau donné à vérifier
     * @param processId chiffre à chercher dans le tableau memory
     * @param fromPos position dans le tableau memory auquel on commence à chercher
     * @return position de la première occurence de processId à partir de
     * fromPos
     */
    static int search(int[] memory, int processId, int fromPos){
        int pos = -1;
        for (int i = fromPos; i < memory.length; i++) {
            if (processId == memory[i]) {
                pos = i;
                break;
            }
        }
        return pos;
        
    }
    
    /**
     * 
     * @param memory tableau donné à vérifier
     * @param startPos position de début d'une ch   îne dont on cherche la longueur
     * @return la taille du processus (ou de l’espace libre) qui commence à la position donnée
     * on suppose que startPos est un indice présent dans le tableau
     */
    static int size(int[] memory, int startPos){
        int taille = 1;
        int i = startPos;
        while(i < memory.length-1 && memory[i+1] == memory[i]) {
            taille++;
            i++;
        }
        return taille;
    }
}
