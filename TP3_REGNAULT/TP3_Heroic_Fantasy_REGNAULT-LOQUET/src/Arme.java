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
    private String nom; // Nom de l'arme
    private int niveauAttaque; // Niveau d'attaque (<= 100)

    // Constructeur
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            throw new IllegalArgumentException("Le niveau d'attaque doit être inférieur ou égal à 100.");
        }
    }

    // Getter pour le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}




    
    
    
    

