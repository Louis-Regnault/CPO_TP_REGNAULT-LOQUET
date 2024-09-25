/*
 * TP1
 * Exercice STATS
 * Louis REGNAULT-LOQUET
 */
package tp1_stats_regnault.loquet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_stats_REGNAULTLOQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] des = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt(); 
        System.out.println("Vous avez saisi : " + m);
        Random generateurAleat = new Random();
        for (int i = 0; i < m; i++) { // m itérations
            int nombreAleatoire = generateurAleat.nextInt(6);  // nombre entre 0 et 5
            des[nombreAleatoire]++;  // Incrémentation de la case
        }
        System.out.println("Résultat après " + m + " itérations (en pourcentages) :");
        for (int i = 0; i < des.length; i++) {
            double pourcentage = ((double) des[i] / m) * 100;
            System.out.println("Face " + (i + 1) + " : " + String.format("%.2f", pourcentage) + "%"); // 2 chiffres après virgule
        }
        scanner.close();
    }
    
}
