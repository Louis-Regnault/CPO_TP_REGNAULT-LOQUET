/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_regnault.loquet;

/**
 *
 * @author louis
 */
public class TP2_relation_1_REGNAULTLOQUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 90) ; 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
        Personne bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines"); 
        System.out.println("liste des voitures disponibles \n"+ uneClio  + 
        "\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra ) ;
        
        Personne Bob = new Personne("Lennon", "Bob");
        bob.liste_voitures[0] = uneClio; // Bob possède une Clio
        bob.nbVoitures = 1; // Mise à jour du nombre de voitures possédées
        uneClio.setProprietaire(Bob); 
        System.out.println("la premiere voiture de Bob est " + 
        Bob.liste_voitures[0] ) ; 
    }
    
}
