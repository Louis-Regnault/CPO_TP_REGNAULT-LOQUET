/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_regnault.loquet;

/**
 *
 * @author louis
 */
public class TP3_Heroic_Fantasy_REGNAULTLOQUET {

    /**
     * @param args the command line arguments
     */
   
    public class Main {
    public static void main(String[] args) {
        // Création de deux instances de Epee avec des paramètres différents
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        // Affichage des informations de chaque épée
        System.out.println(epee1);
        System.out.println(epee2);
    }
    }
}

