import java.util.Scanner; 

public class Verificador_Palindromos { 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra o frase:");
        String original = scanner.nextLine();

        
        String procesado = original.replace(" ", "").toLowerCase();

        
        String invertido = new StringBuilder(procesado).reverse().toString();

    
        if (procesado.equals(invertido)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        System.out.println("Texto al revés: " + new StringBuilder(original).reverse().toString());

        scanner.close(); 
    }
}
//Fin