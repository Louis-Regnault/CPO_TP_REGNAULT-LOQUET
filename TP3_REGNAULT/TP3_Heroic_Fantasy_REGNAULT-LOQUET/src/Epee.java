/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
// Sous-classe Epee qui hérite de Arme
public class Epee extends Arme {
    // Attribut spécifique pour l'épée
    private int indiceFinesse;

    // Constructeur pour initialiser les paramètres hérités et l'indice de finesse
    public Epee(String nom, int niveauAttaque, int indiceFinesse) {
        super(nom, niveauAttaque); // Initialise le nom et le niveau d'attaque
        if (indiceFinesse < 100) { // Vérifie que l'indice de finesse est inférieur à 100
            this.indiceFinesse = indiceFinesse;
        } else {
            throw new IllegalArgumentException("L'indice de finesse doit être < 100");
        }
    }

    // Méthode pour obtenir l'indice de finesse
    public int getIndiceFinesse() {
        return indiceFinesse;
    }

    // Redéfinition de la méthode toString pour inclure l'indice de finesse
    @Override
    public String toString() {
        return super.toString() + ", Indice de finesse: " + indiceFinesse;
    }
}

    
    
    
    

