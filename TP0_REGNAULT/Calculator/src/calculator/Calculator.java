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
    }
}
