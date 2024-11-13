/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
public class Baton extends Arme{
    int age;

    public Baton(int age, String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
        if (age < 100) { // Vérifie que l'âge est inférieur à 100
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge doit être < 100");
        }
        
    }
        public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Caractéristique Baton{" + "age=" + age + '}';
    }
        
    
    
}
