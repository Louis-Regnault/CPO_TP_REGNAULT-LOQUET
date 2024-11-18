/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */

// Classe Epee héritant de Arme
public class Epee extends Arme {
    // Attribut propre à Epee
    private int indiceFinesse;

    // Constructeur
    public Epee(String nom, int niveauAttaque, int indiceFinesse) {
        super(nom, niveauAttaque); // Appel du constructeur de la classe mère
        if (indiceFinesse < 100) {
            this.indiceFinesse = indiceFinesse;
        } else {
            throw new IllegalArgumentException("L'indice de finesse doit être inférieur à 100.");
        }
    }

    // Accesseur pour l'indice de finesse
    public int getIndiceFinesse() {
        return indiceFinesse;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + ", Indice de finesse: " + indiceFinesse;
    }
}


    
    
    
    

