/*
 * TP2
 * Exercice Bieres
 * Louis REGNAULT-LOQUET
 */
package tp2_bieres_regnault.loquet;

/**
 *
 * @author louis
 */
public class TP2_Bieres_REGNAULTLOQUET {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        // Utilisation du constructeur
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0f, "Brasserie Dubuisson");
        uneBiere.lireEtiquette();  
        BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        uneSecondeBiere.lireEtiquette();  
    }
    }

