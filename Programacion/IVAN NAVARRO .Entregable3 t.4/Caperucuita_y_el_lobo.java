import java.util.Scanner;
public class Caperucuita_y_el_lobo {

    static int caperucita = -1;
    static int lobo = -1;
    static int aldeanosVivos = 8;
    static boolean dobleAtaque = false; 

   
    static int asignarNumero() {
        return (int) (Math.random() * 10) + 1;
    }

    
    static int intentarAtrapar(Scanner scanner) {
        System.out.println("Aldeanos vivos: " + aldeanosVivos);
        System.out.print("Elige un número del 1 al 10 para  atrapar al lobo: ");
        int eleccion = scanner.nextInt();

        if (eleccion == lobo) {
            System.out.println("¡Has atrapado al lobo!");
            return 1; 
        } else if (eleccion == caperucita) {
            System.out.println(" ¡Oh no! Has elegido a Caperucita...");
            dobleAtaque = true;
            return 2; 
        } else {
            System.out.println("Has atrapado a un aldeano inocente...");
            return 3; 
        }
    }

   
    static boolean loboCome() {
        int victimas = dobleAtaque ? 2 : 1; 
        dobleAtaque = false; 

        for (int i = 0; i < victimas; i++) {
            if (aldeanosVivos <= 0) break; 

            int victima = asignarNumero();

            if (victima == caperucita) {
                System.out.println(" El lobo se ha comido a Caperucita...");
                return true; 
            } else if (victima == lobo) {
              
                i--;
                continue;
            } else {
                aldeanosVivos--;
                System.out.println(" El lobo se ha comido a un aldeano. Quedan " + aldeanosVivos + " aldeanos.");
            }
        }
        return false; 
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado;
        boolean loboGana = false;
        boolean usuarioGana = false;
        int dia = 1;

        System.out.println(" JUEGO: CAPERUCITA, EL LOBO Y EL USUARIO");

       
        while (!loboGana && !usuarioGana && aldeanosVivos > 0) {
            System.out.println(".....");
            System.out.println(" Día " + dia);

           
            lobo = asignarNumero();
            do {
                caperucita = asignarNumero();
            } while (caperucita == lobo); 

            
            resultado = intentarAtrapar(scanner);

            if (resultado == 1) { 
                usuarioGana = true;
            } else {
                System.out.println(" Llega la noche.");
                loboGana = loboCome(); 
            }

            dia++;
        }

       
        System.out.println("....");
        if (usuarioGana) {
            System.out.println(" ¡VICTORIA! Has atrapado al lobo .");
        } else if (loboGana) {
            System.out.println(" El lobo gana _Caperucita ha sido devorada.");
        } else {
            System.out.println(" Error");
        }

        scanner.close();
    }
}