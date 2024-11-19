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
   
    


    public static void main(String[] args) {
        // Création des épées avec des paramètres différents
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        // Création des bâtons avec des paramètres différents
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Affichage des objets
        System.out.println("Objets créés :");
        System.out.println(epee1);
        System.out.println(epee2);
        System.out.println(baton1);
        System.out.println(baton2);

    }
}






