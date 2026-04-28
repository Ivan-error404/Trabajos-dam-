import java.util.Scanner; 

public class otxet {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe lo que quieras y lo invertiré:");
        String textoOriginal = scanner.nextLine();

        String textoInvertido = new StringBuilder(textoOriginal).reverse().toString();

        System.out.println("Texto invertido: " + textoInvertido);

        scanner.close();
    }
}

//Fin