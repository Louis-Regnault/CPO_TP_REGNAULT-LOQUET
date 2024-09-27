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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0f, "Dubuisson");
        uneBiere.lireEtiquette();  // Affichage de l'étiquette de la première bière
        
        BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        uneSecondeBiere.lireEtiquette();
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");
        troisiemeBiere.lireEtiquette();  // Affichage de l'étiquette de la troisième bière
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Kwak", 8.4f, "Brouwerij Bosteels");
        quatriemeBiere.lireEtiquette();  // Affichage de l'étiquette de la quatrième bière
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Hoegaarden", 4.9f, "Brouwerij van Hoegaarden");
        cinquiemeBiere.lireEtiquette();
    }
    }

