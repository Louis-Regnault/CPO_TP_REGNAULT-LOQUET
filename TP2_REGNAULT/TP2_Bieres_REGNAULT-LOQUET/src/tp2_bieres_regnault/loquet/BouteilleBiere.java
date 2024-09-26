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
    
public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie);
    }
}