/*
* TP0 Exo2
* Louis Regnault-Loquet
* Groupe : TDB
* Septembre 2024
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
 int nb; // nombre dentiers a additionner
 int result; // resultat
 int ind; //indice
 Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre d'entiers à additionner :");
        nb = sc.nextInt();
 result=0;
 // Addition des nb premiers entiers
 ind=1;
 while (ind <= nb) {
 result=result+ind;
 ind+=1;
 }
 // Affichage du resultat
 System.out.println();
 System.out.println("La somme des "+ nb + " entiers est: "+result);
    }
    
}
