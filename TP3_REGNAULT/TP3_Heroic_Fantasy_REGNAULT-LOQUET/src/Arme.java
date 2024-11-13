/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public abstract class Arme {
    String nom;
    int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque <= 100) { // Vérifie que le niveau d'attaque est inférieur ou égal à 100
            this.niveauAttaque = niveauAttaque;
        } else {
            throw new IllegalArgumentException("Le niveau d'attaque doit être <= 100");
        }
    
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    

    @Override
    public String toString() {
        return "Caractéristiques de l'A"
                + "arme{" + "nom=" + nom + ", niveauAttaque=" + niveauAttaque + '}';
    }

    
    
    
    
}
