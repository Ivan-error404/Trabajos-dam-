import java.util.Scanner;

public class entergable3t4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
            
            if (numero < 10) {
                mostrarTablas(numero); 
            } else {
                mostrarTablas(); 
            }
            
            sc.close();
    }
        public static void mostrarTablas(int limite) {
            for (int i = 1; i <= limite; i++) {
                System.out.println("\nTabla del " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        }
            public static void mostrarTablas() {
                mostrarTablas(10); 
            }
}