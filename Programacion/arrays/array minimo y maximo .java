package com.mycompany.mavenproject14;
import java.util.Arrays;

public class arrayminimoymaximo {

    public static void main(String[] args) {

        int [] numeros = {3, 7, 2, 9, 4}; 
       
        for (int i = 0; i <= 4; i++)
            System.out.println("Indice "+ 1 +" :"  + numeros[i] );  
        
int minimo = Integer.MAX_VALUE;
int maximo = Integer.MIN_VALUE;

for (int num : numeros) {
    if (num < minimo) {
        minimo = num;
    }
    if (num > maximo) {
        maximo = num;
    }
}

System.out.println("Minimo: " + minimo); 
System.out.println("Maximo: " + maximo); 

        }
}

    
   
