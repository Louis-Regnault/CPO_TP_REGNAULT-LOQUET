/*
 * TP2 Convertisseur
 * Louis REGNAULT-LOQUET
 */
package tp2_convertisseurobjet_regnault.loquet;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP2_convertisseurObjet_REGNAULTOQUET {
    
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }
    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }
    public static double KelvinVersFarenheit(double tKelvin) {
        double tCelcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelcius);
    }
    public static double FarenheitVersKelvin(double tFahrenheit) {
        double tCelcius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(tCelcius);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer une température : ");
        double temperature = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        int choix = sc.nextInt();

        double resultat = 0;  //

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(temperature);
                System.out.println(temperature + " degré Celsius est égal à " + resultat + " degrés Kelvin");
                break;
            case 2:
                resultat = KelvinVersCelcius(temperature);
                System.out.println(temperature + " degré Kelvin est égal à " + resultat + " degrés Celsius");
                break;
            case 3:
                resultat = FarenheitVersCelcius(temperature);
                System.out.println(temperature + " degré Fahrenheit est égal à " + resultat + " degrés Celsius");
                break;
            case 4:
                resultat = CelciusVersFarenheit(temperature);
                System.out.println(temperature + " degré Celsius est égal à " + resultat + " degrés Fahrenheit");
                break;
            case 5:
                resultat = KelvinVersFarenheit(temperature);
                System.out.println(temperature + " degré Kelvin est égal à " + resultat + " degrés Fahrenheit");
                break;
            case 6:
                resultat = FarenheitVersKelvin(temperature);
                System.out.println(temperature + " degré Fahrenheit est égal à " + resultat + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide. Veuillez saisir une valeur entre 1 et 6.");
        }
    }
}
