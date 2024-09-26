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
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des Trolls";
        uneBiere.degreAlcool = (float) 7.0;
        uneBiere.brasserie = "Brasserie Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
    }
    
}
