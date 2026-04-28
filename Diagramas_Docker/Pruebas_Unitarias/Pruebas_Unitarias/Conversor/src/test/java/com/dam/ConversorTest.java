package com.dam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConversorTest
{

    private Conversor conversor;

    @BeforeEach
    void setUp()
    {
        conversor = new Conversor();
    }

    @Test
    @DisplayName("Punto de congelación: 0°C debería ser 32°F")
    void testCongelacion_1()
    {
        double resultado = conversor.celsiusAFahrenheit(0);

        // assertEquals(esperado, actual, margen_error)
        assertEquals(32.0, resultado, 0.001);
    }

    @Test
    @DisplayName("Punto de ebullición: 100°C debería ser 212°F")
    void testEbullicion_1()
    {
        assertEquals(212.0, conversor.celsiusAFahrenheit(100), 0.001);
    }

    @Test
    @DisplayName("Temperatura bajo cero: -40°C debería ser -40°F")
    void testFrioExtremo_1()
    {
        assertEquals(-40.0, conversor.celsiusAFahrenheit(-40), 0.001);
    }

    //Nuevo

// Fahrenheit a Celsius

     @Test
    @DisplayName("Fahrenheit a Celsius: 32°F debería ser 0°C")
    void test_fareheit_A_Celsius_Congelacion() {
        // Probamos el método que convierte de F a C
        double resultado = conversor. fareheit_A_Celsius(32);
        assertEquals(0.0, resultado, 0.001);
    }

        @Test
    @DisplayName("Fahrenheit a Celsius: 212°F debería ser 100°C")
    void test_Ebullicion_fareheit_A_Celsius() {
        // CORRECCIÓN: Entra 212 (F), sale 100 (C)
        double resultado = conversor.fareheit_A_Celsius(212);
        assertEquals(100.0, resultado, 0.001);
    }


     @Test
    @DisplayName("Punto de coincidencia: -40°F debería ser -40°C")
    void test_Punto_Coincidencia_fareheit_A_Celsius() {
        // -40 es el único punto donde F y C son iguales
        assertEquals(-40.0, conversor. fareheit_A_Celsius(-40), 0.001);
    }

    
// celsius a kelvin 

     @Test
    @DisplayName("Celsius_A_Kelvin: 32°F debería ser 0°C")
    void test_Celdius_A_Kelvin_Congelacion() {
        // Probamos el método que convierte de F a C
           double resultado = conversor.Celsius_A_Kelvin(0);
        assertEquals(273.15, resultado, 0.001);
    }

     @Test
    @DisplayName("Celsius_A_Kelvin: 100°C debería ser 373.15°K")
    void test_Ebullicion_Celsius_A_Kelvin() {
        // Probamos el método que convierte de C a F
        double resultado = conversor.Celsius_A_Kelvin(100);
        assertEquals(373.15, resultado, 0.001);
    }

     @Test
    @DisplayName("Punto de coincidencia: -40°F debería ser -40°C")
    void test_Punto_Coincidencia_Celsius_A_Kelvin() {
        // -40 es el único punto donde F y C son iguales
       double resultado = conversor.Celsius_A_Kelvin(-40);
        assertEquals(233.15, resultado, 0.001);
    }

    //Convertir_Celsius_A_Kelvin

      @Test
    @DisplayName("Kelvin a Celsius: 273.15K debería ser 0°C")
    void test_Kelvin_A_Celsius_Congelacion() {
        // 273.15 Kelvin es el punto de congelación (0°C)
        double resultado = conversor.Kelvin_A_Celsius(273.15);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    @DisplayName("Kelvin a Celsius: 373.15K debería ser 100°C")
    void test_Kelvin_A_Celsius_Ebullicion() {
        // 373.15 Kelvin es el punto de ebullición (100°C)
        double resultado = conversor.Kelvin_A_Celsius(373.15);
        assertEquals(100.0, resultado, 0.001);
    }

    @Test
    @DisplayName("Kelvin a Celsius: 0K debería ser -273.15°C")
    void test_Cero_Absoluto_Kelvin_A_Celsius() {
        // 0 Kelvin es el cero absoluto
        double resultado = conversor.Kelvin_A_Celsius(0);
        assertEquals(-273.15, resultado, 0.001);
    }
    
}
//Fin