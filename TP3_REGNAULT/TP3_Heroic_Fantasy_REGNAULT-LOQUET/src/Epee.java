/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public class Epee extends Arme {
    
    int IndiceFinesse;

    public Epee(int IndiceFinesse, String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
        this.IndiceFinesse = IndiceFinesse;
        if (IndiceFinesse < 100) { // Vérifie que l'indice de finesse est inférieur à 100
            this.IndiceFinesse = IndiceFinesse;
        } else {
            throw new IllegalArgumentException("L'indice de finesse doit être < 100");
        }
           
    }

    public int getIndiceFinesse() {
        return IndiceFinesse;
    }

    @Override
    public String toString() {
        return "Caractéristique Epee{" + "Indice Finesse = " + IndiceFinesse + '}';
    }
    
    
    
    
}
