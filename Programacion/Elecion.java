import java.util.Scanner;

public class Elecion {

    public static void main(String[] args) {

        Scanner menus = new Scanner(System.in);
      

        System.out.println("Menús disponibles:");
        System.out.println("1. Pizza");
        System.out.println("2. Vegano");
        System.out.println("3. Ensalada");
        System.out.println("4. Sushi");

        System.out.print("Elige un número de menú: ");
        int opcion = menus.nextInt();
        double precio=0;
    
        switch (opcion) {
            case 1:
                System.out.println("Has elegido Pizza");
                precio = 15;
                break;
            case 2:
                System.out.println("Has elegido Menú Vegano");
                precio = 10;
                break;
            case 3:
                System.out.println("Has elegido Ensalada");
                precio = 10;
                break;
            case 4:
                System.out.println("Has elegido Sushi");
                precio = 8;
                break;
            default:
                System.out.println("Error: número de menú no existe");
                menus.close();
        }

        System.out.println("Método de pago:");
        System.out.println("1. Tarjeta");
        System.out.println("2. Efectivo");
        System.out.print("Selecciona tu método de pago: ");
        int metodoPago = menus.nextInt();

        if (metodoPago == 1) {
            System.out.println("Has elegido pagar con tarjeta.");
        } else if (metodoPago == 2) {
            System.out.println("Has elegido pagar en efectivo.");
        } else {
            System.out.println("Método de pago inválido.");
            menus.close();
        }

        System.out.println("¿Quieres dejar propina?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Elige una opción: ");
        int propina = menus.nextInt();

        if (propina == 1) {
            System.out.println("dejar propina.");
            precio = precio + (precio*0.1);
        } else if (propina == 2) {
            System.out.println("No propina.");
        } else {
            System.out.println("Opción inválida.");
        }

        System.out.println("El precio total de tu pedido es: " + precio);

        menus.close();
    }
}