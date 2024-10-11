/*
 * TP2 Convertisseur
 * Louis REGNAULT-LOQUET
 */
package tp2_convertisseurobjet_regnault.loquet;
import Convertisseur.Convertisseur;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP2_convertisseurObjet_REGNAULTOQUET {
 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();

        System.out.print("Veuillez entrer une température : ");
        float temperature = sc.nextFloat();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        int choix = sc.nextInt();
        float resultat = 0;

        switch (choix) {
            case 1:
                resultat = convertisseur.CelsiusVersKelvin(temperature);
                System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Kelvin");
                break;
            case 2:
                resultat = convertisseur.KelvinVersCelsius(temperature);
                System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Celsius");
                break;
            case 3:
                resultat = convertisseur.FahrenheitVersCelsius(temperature);
                System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius");
                break;
            case 4:
                resultat = convertisseur.CelsiusVersFahrenheit(temperature);
                System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit");
                break;
            case 5:
                resultat = convertisseur.KelvinVersFahrenheit(temperature);
                System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit");
                break;
            case 6:
                resultat = convertisseur.FahrenheitVersKelvin(temperature);
                System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide. Veuillez saisir une valeur entre 1 et 6.");
        }

        // Affichage du nombre de conversions effectuées
        System.out.println(convertisseur.toString());
    }
}
}
