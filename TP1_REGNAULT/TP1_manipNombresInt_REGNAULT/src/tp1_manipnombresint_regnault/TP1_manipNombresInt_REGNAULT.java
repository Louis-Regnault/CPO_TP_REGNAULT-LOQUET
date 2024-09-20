/*
 * TP1
 * Exercice 1 : manipnombreint
 * Louis Regnault-Loquet
 */
package tp1_manipnombresint_regnault;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_manipNombresInt_REGNAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer le premier entier : ");
        int entier1 = sc.nextInt();
        System.out.print("Veuillez entrer le deuxième entier : ");
        int entier2 = sc.nextInt();
        System.out.println("Vous avez entré les valeurs : " + entier1 + " et " + entier2);
        
        int somme = entier1 + entier2;
        int difference = entier1 - entier2;
        int produit = entier1 * entier2;
         System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
        
        if (entier2 != 0) {
            int quotient = entier1 / entier2;
            int reste = entier1 % entier2;
            System.out.println("Le quotient entier de " + entier1 + " divisé par " + entier2 + " est : " + quotient);
            System.out.println("Le reste de la division de " + entier1 + " par " + entier2 + " est : " + reste);
        } else {
            System.out.println("Erreur : pas de division par 0");
        }
    }
    
}
