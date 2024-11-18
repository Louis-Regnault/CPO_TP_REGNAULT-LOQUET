/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
// Classe abstraite Arme
public abstract class Arme {
    private String nom;
    private int niveauAttaque;

    // Constructeur
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            throw new IllegalArgumentException("Le niveau d'attaque doit être inférieur ou égal à 100.");
        }
    }

    // Accesseur pour le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Accesseur pour le nom
    public String getNom() {
        return nom;
    }

    // Méthode toString redéfinie
    @Override
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}



    
    
    
    

