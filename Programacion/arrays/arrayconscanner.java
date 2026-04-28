
import java.util.Scanner;

public class arrayconscanner{

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("longitud del array: ");
        int longitud = scanner.nextInt();

       
        int[] original = new int[longitud];

        
        System.out.println("Ingrese los " + longitud + " numeros del array:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Numero en la posicion " + i + ": ");
            original[i] = scanner.nextInt();
        }

        
        scanner.close();


        } 
    }