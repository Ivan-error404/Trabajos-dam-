// crea un programa que sea un calculadora 
package com.mycompany.maquina_expendedora;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Elige una operación (1 - Suma, 2 - Resta, 3 - Multiplicación, 4 - División):");
        int operacion = sc.nextInt();

        double resultado;

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}