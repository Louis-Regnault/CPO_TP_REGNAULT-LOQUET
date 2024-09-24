/*
 * TP1
 * guessMyNumber
 * Louis Regnault-Loquet
 */
package tp1_guessmynumber_regnault.loquet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_guessMyNumber_REGNAULTLOQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.println("Choisissez un niveau de difficulté : ");
        System.out.println("1 - Facile (intervalle 0-50, tentatives illimitées)");
        System.out.println("2 - Normal (intervalle 0-100, 10 tentatives)");
        System.out.println("3 - Difficile (intervalle 0-200, 5 tentatives)");
        int choix = scanner.nextInt();

        int nombreMax = 100;  
        int tentativesMax = -1;  // -1 = pas de limite
        boolean indicesFaciles = false;  // Par défaut, pas d'indices très détaillés
        
        switch (choix) {
            case 1:  
                nombreMax = 50;
                indicesFaciles = true;
                break;
            case 2: 
                nombreMax = 100;
                tentativesMax = 10;  
                break;
            case 3:  
                nombreMax = 200;
                tentativesMax = 5;  
                break;
            default:
                System.out.println("Choix non valide, le mode normal sera utilisé par défaut.");
        }
        int nombreAleatoire = generateurAleat.nextInt(nombreMax + 1);  
        int tentatives = 0;
        
        while (tentativesMax == -1 || tentatives < tentativesMax) {
            System.out.print("Devinez un nombre entre 0 et " + nombreMax + " : ");
            int nombreUtilisateur = scanner.nextInt();
            tentatives++;
            
            int difference = Math.abs(nombreUtilisateur - nombreAleatoire); // différence très grande entre 2 nombres
            
            if (nombreUtilisateur == nombreAleatoire) {
                System.out.println("Gagné ! Vous avez trouvé le nombre en " + tentatives + " tentatives.");
                break;
            } else if (nombreUtilisateur < nombreAleatoire) {
                if (indicesFaciles && difference > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else {
                if (indicesFaciles && difference > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            }
            if (tentativesMax != -1 && tentatives == tentativesMax) { // tentative max en normal ou difficile
                System.out.println("Vous avez atteint la limite de tentatives. Le nombre était : " + nombreAleatoire);
                break;
            }
        }

        // Fermeture du scanner
        scanner.close();
    }
}


