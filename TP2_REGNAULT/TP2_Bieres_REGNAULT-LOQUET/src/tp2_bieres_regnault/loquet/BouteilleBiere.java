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
    
// Constructeur avec paramètres
    public BouteilleBiere(String nom, float degreAlcool, String brasserie) {
        this.nom = nom; // this distingue l'attribut des variables
        this.degreAlcool = degreAlcool;
        this.brasserie = brasserie;
        this.ouverte = false;
    }
    
public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie);
    }
}