/*
 * TP1
 * Exercice 2 : Convertisseur
 * Louis Regnault-Loquet
 */
package tp1_convertisseur_regnault;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_convertisseur_REGNAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer une valeur réelle : ");
        double valeurReelle = sc.nextDouble();
        System.out.println("La valeur réelle saisie est : " + valeurReelle);
    }
    
}
