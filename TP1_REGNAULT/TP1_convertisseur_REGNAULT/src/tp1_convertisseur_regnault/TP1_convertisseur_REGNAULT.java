/*
 * TP1
 * Exercice 2 : Convertisseur
 * Louis Regnault-Loquet
 */
package tp1_convertisseur_regnault;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_convertisseur_REGNAULT {
    
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
        System.out.print("Veuillez entrer une température en degrés Celsius : ");
        double temperatureCelsius = sc.nextDouble();
        double temperatureKelvin = temperatureCelsius + 273.15;
        System.out.println("La température saisie en degrés Celsius est : " + temperatureCelsius);
        System.out.println("La température correspondante en Kelvin est : " + temperatureKelvin);
    }
}


