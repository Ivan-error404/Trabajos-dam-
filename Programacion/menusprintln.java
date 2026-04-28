import java.util.Scanner;
public class menus {
public static void main(String[] args) {

    try (Scanner entrada = new Scanner(System.in)) {
        Scanner postre = new Scanner(System.in);
        Scanner bebida = new Scanner(System.in);
        
        int OPCIONES;
        int postrese;
        int bebidase;

        System.out.println("===== OPCIONES =====");
        System.out.println("1. Plato principal Albóndigas");
        System.out.println("2. Plato principal Paella");
        System.out.println("3. Postre de platano");
        System.out.println("4. Postre de crema catalana");
        System.out.println("5. Bebida de Agua");
        System.out.println("6. Bebida de Cerveza Turia");


System.out.println();
        System.out.println("Plato principal(1-2): ");
System.out.println();
            System.out.println("1. Plato principal Albóndigas");
        System.out.println("2. Plato principal Paella");
        OPCIONES= entrada.nextInt();
        System.out.println("");
        switch (OPCIONES) {
            
            case 1 -> System.out.println("Has elegido plato de Albondigas");
            case 2 -> System.out.println("Has elegido plato de Paella");
    
            default -> System.out.println("Opcion no válida. Por favor, elige entre 1 y 2.");
            
        }
        System.out.println("NO se puede canbiar el plato");
        System.out.println("");
 System.out.println("Postre");
 System.out.println();
  System.out.println("3. Postre de platano");
        System.out.println("4. Postre de crema catalana");
        System.out.println();
        postrese= postre.nextInt();
        switch (postrese) {
            

            case 3 -> System.out.println("Has elegido  Postre de platano");
            case 4 -> System.out.println("Has elegidoPostre de crema catalana");
      
            default -> System.out.println("Opcion no válida. Por favor, elige entre 3 y 4.");
            
        }
        System.out.println("");
    
          System.out.println("bebida");
          System.out.println();
          System.out.println("5. Bebida de Agua");
        System.out.println("6. Bebida de Cerveza Turia");
        System.out.println();
        bebidase= bebida.nextInt();
        
        switch (bebidase) {
            
            
            
    
            case 5 -> System.out.println("Has elegido Bebida de Agua");
            case 6 -> System.out.println("Has elegido Bebida de Cerveza Turia");
            default -> System.out.println("Opcion no válida. Por favor, elige entre 5 y 6.");
             

       
        }   
    bebida.close();
         System.out.print("");
     System.out.print("Has elegido ");

    }
}
}
