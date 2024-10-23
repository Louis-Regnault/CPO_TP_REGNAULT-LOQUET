/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_regnault.loquet;

/**
 *
 * @author louis
 */
public class Personne {
    private String nom;
    private String prenom;
    private Voiture[] liste_voitures; // Array to hold up to 3 cars
    private int nbVoitures; // Number of cars owned

    // Constructor
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3]; // Allocate memory for up to 3 cars
        this.nbVoitures = 0; // Initially, the person owns 0 cars
    }
    // ajoutez une voiture à une personne
    public boolean ajouterVoiture(Voiture voiture) {
        if (nbVoitures < 3) {
            liste_voitures[nbVoitures] = voiture;
            voiture.setProprietaire(this); // assigner propriétaire de la voiture
            nbVoitures++;
            return true; 
        } else {
            System.out.println("Impossible d'ajouter plus de 3 voitures.");
            return false; 
        }
    }

    // Method to get the full name of the person
    public String getNomComplet() {
        return prenom + " " + nom;
    }

    // toString() method
    @Override
    public String toString() {
        String result = "Personne [Nom: " + nom + ", Prénom: " + prenom + ", Voitures: ";
        for (int i = 0; i < nbVoitures; i++) {
            result += liste_voitures[i].toString() + " ";
        }
        return result + "]";
    }
}

