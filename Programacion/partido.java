import java.util.Scanner;
public class partido {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int puntosTotales = 0 ;
        String equipoElegido = "";
        
        System.out.println("===== EQUIPOS =====");
        System.out.println("1. Equipo Rojo");
        System.out.println("2. Equipo Verde");
        System.out.println("3. Equipo Azul");
        System.out.println("4. Equipo Rosa");
        System.out.print("Elige un equipo (1-4): ");
        opcion = entrada.nextInt();

        switch (opcion) {

                    case 1 -> System.out.println("Has elegido equipo ROJO ");
                    case 2 -> System.out.println("Has elegido equipo VERDE");
                    case 3 -> System.out.println("Has elegido equipo AZUL");
                    case 4 -> System.out.println("Has elegido equipo ROSA");

                    default -> {
                        System.out.println("Opcion no valida. Por favor, elige entre 1 y 4.");
                        
                        entrada.close();
                        return;
            }
        }
                System.out.println("Partido" + equipoElegido);
                System.out.println("===== Partidos =====");



        switch (opcion) {
            case 0 -> {
                System.out.println("ROJO VERDE");
                puntosTotales += jugarPartido("ROJO", "AZUL");
                puntosTotales += jugarPartido("ROJO", "ROSA");
            }
            case 2 -> {
                puntosTotales += jugarPartido("VERDE", "ROJO");
                puntosTotales += jugarPartido("VERDE", "AZUL");
                puntosTotales += jugarPartido("VERDE", "ROSA");
            }
            case 3 -> {
                puntosTotales += jugarPartido("AZUL", "ROJO");
                puntosTotales += jugarPartido("AZUL", "VERDE");
                puntosTotales += jugarPartido("AZUL", "ROSA");
            }
            case 4 -> {
                puntosTotales += jugarPartido("ROSA", "ROJO");
                puntosTotales += jugarPartido("ROSA", "VERDE");
                puntosTotales += jugarPartido("ROSA", "AZUL");
            }
            default -> {
            }
        }

        System.out.println("Puntos totales: " + puntosTotales);
    }

    public static int jugarPartido(String equipo1, String equipo2) {
        System.out.println("Jugando: " + equipo1 + " vs " + equipo2);
        return 1; 
}}