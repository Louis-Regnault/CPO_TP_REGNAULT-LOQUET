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
    // Attribut propre à Baton
    private int age;

    // Constructeur
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appel du constructeur de la classe mère
        if (age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge du bâton doit être inférieur à 100.");
        }
    }

    // Accesseur pour l'âge
    public int getAge() {
        return age;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }
}

