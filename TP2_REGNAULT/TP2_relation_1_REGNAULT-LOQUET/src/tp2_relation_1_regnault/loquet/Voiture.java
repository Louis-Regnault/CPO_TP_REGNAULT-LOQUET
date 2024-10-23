/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_regnault.loquet;

/**
 *
 * @author louis
 */
public class Voiture {
    private String Modele;
    private String Marque;
    private int PuissanceCV;

    public Voiture(String modele, String marque, int PuissanceCV) {
        this.Modele = modele;
        this.Marque = marque;
        this.PuissanceCV = PuissanceCV;
    }

    @Override
    public String toString() {
        return "Voiture{" + "modele=" + Modele + ", marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
    
    
    
}
