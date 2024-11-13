/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
// Déclaration de la classe abstraite Arme
public abstract class Arme {
    // Attributs de la classe
    private String nom;
    private int niveauAttaque;

    // Constructeur pour initialiser le nom et le niveau d'attaque
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque <= 100) { // Vérifie que le niveau d'attaque est inférieur ou égal à 100
            this.niveauAttaque = niveauAttaque;
        } else {
            throw new IllegalArgumentException("Le niveau d'attaque doit être <= 100");
        }
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString pour afficher le nom et le niveau d'attaque
    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveauAttaque=" + niveauAttaque + '}';
    }
}



    
    
    
    

