package com.dam;

public class Conversor
{

    public double celsiusAFahrenheit(double celsius)
    {
        // La fórmula es: (Celsius * 9/5) + 32
        return (celsius * 1.8) + 32;
    }



      public double fareheit_A_Celsius(double Convertir_farenheit_devuelve_celsius)
    {
        // La fórmula es: (Celsius * 9/5) + 32
        return (Convertir_farenheit_devuelve_celsius- 32)/1.8;
    }
    
// 1
       public double Celsius_A_Kelvin(double Convertir_Celsius_A_Kelvin)
    {
        // La fórmula es: (Celsius * 9/5) + 32
        return (Convertir_Celsius_A_Kelvin + 273.15);
    }

    // 2



    
       public double Kelvin_A_Celsius(double Convertir_Celsius_A_Kelvin)
    {
        // La fórmula es: (Celsius * 9/5) + 32
        return (Convertir_Celsius_A_Kelvin - 273.15);
    }
    
}