/*
*Exercice 3 : Calculator
*TP0
*Louis Regnault-Loquet
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur = 0;
        double operande1,operande2,resultat=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                          Please enter the operator :
                          1)add
                          2)substract
                          3)multiply
                          4)divide
                          5)modulo""");
        operateur = sc.nextInt();
        System.out.println("Vous avez choisi l'operateur: " + operateur);
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : opérateur non valide. Veuillez choisir un opérateur entre 1 et 5.");
            System.exit(0);
        } else {
        }
        System.out.print("Veuillez entrer la première valeur : ");
        operande1 = sc.nextDouble();  
        System.out.println("La première valeur saisie est : " + operande1);
        System.out.print("Veuillez entrer la deuxième valeur : ");
        operande2 = sc.nextDouble();  
        System.out.println("La deuxième valeur saisie est : " + operande2);
        if (operateur == 1) {
            resultat = operande1 + operande2;
        } else if (operateur == 2) {
            resultat = operande1 - operande2;
        } else if (operateur == 3) {
            resultat = operande1 * operande2;
        } else if (operateur == 4) {
            resultat = operande1 / operande2;
        } else if (operateur == 5) {
            resultat = operande1 % operande2; }
        System.out.println("Le résultat est : " + resultat);
    }
}
