/*
 * TP2
 * Exercice BouteilleBiere
 * Louis REGNAULT-LOQUET
 */
package tp2_bieres_regnault.loquet;

/**
 *
 * @author louis
 */
    public class BouteilleBiere {
    String nom;            
    float degreAlcool;     
    String brasserie;      
    boolean ouverte;
    
    public BouteilleBiere() {
        this.nom = "Inconnue";
        this.degreAlcool = 0.0f;
        this.brasserie = "Inconnue";
        this.ouverte = false;
    }
    
    // Constructeur avec trois paramètres
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;  // bouteille fermée par défaut
    }
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie);
    }
}