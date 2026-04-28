import java.util.Scanner;

public class menu1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variables para guardar las elecciones del usuario
        String platoPrincipal = null;
        String postre = null;
        String bebida = null;
        
        // Bucle: se repite hasta que el usuario haya elegido las tres cosas
        while (platoPrincipal == null || postre == null || bebida == null) {
            System.out.println("===== MENÚ DE OPCIONES =====");
            System.out.println("1. Plato principal: Albóndigas");
            System.out.println("2. Plato principal: Paella");
            System.out.println("3. Postre: Plátano");
            System.out.println("4. Postre: Crema catalana");
            System.out.println("5. Bebida: Agua");
            System.out.println("6. Bebida: Cerveza Turia");
            System.out.print("Elige una opción (1-6): ");

            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    if (platoPrincipal == null) {
                        platoPrincipal = "Albóndigas";
                        System.out.println("Has elegido Albóndigas como plato principal.");
                    } else {
                        System.out.println("Ya has elegido un plato principal: " + platoPrincipal);
                    }
                    break;
                case 2:
                    if (platoPrincipal == null) {
                        platoPrincipal = "Paella";
                        System.out.println("Has elegido Paella como plato principal.");
                    } else {
                        System.out.println("Ya has elegido un plato principal: " + platoPrincipal);
                    }
                    break;
                case 3:
                    if (postre == null) {
                        postre = "Plátano";
                        System.out.println("Has elegido Plátano como postre.");
                    } else {
                        System.out.println("Ya has elegido un postre: " + postre);
                    }
                    break;
                case 4:
                    if (postre == null) {
                        postre = "Crema catalana";
                        System.out.println("Has elegido Crema catalana como postre.");
                    } else {
                        System.out.println("Ya has elegido un postre: " + postre);
                    }
                    break;
                case 5:
                    if (bebida == null) {
                        bebida = "Agua";
                        System.out.println("Has elegido Agua como bebida.");
                    } else {
                        System.out.println("Ya has elegido una bebida: " + bebida);
                    }
                    break;
                case 6:
                    if (bebida == null) {
                        bebida = "Cerveza Turia";
                        System.out.println("Has elegido Cerveza Turia como bebida.");
                    } else {
                        System.out.println("Ya has elegido una bebida: " + bebida);
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige entre 1 y 6.");
                    break;
            }

            System.out.println();
        }
        System.out.println("===== PEDIDO COMPLETO =====");
        System.out.println("Plato principal: " + platoPrincipal);
        System.out.println("Postre: " + postre);
        System.out.println("Bebida: " + bebida);
        System.out.println("¡Gracias por tu pedido!");

        entrada.close();
    }
}