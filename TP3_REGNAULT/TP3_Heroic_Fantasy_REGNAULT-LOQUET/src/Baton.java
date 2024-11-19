/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
// Classe Baton héritant de Arme

public class Baton extends Arme {
    private int age; // Âge du bâton (< 100)

    // Constructeur
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appel au constructeur de la classe parent (Arme)
        if (age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge du bâton doit être inférieur à 100.");
        }
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Baton: " + getNom() + ", Niveau d'attaque: " + getNiveauAttaque() +
               ", Âge: " + age + "\n";
    }
}


