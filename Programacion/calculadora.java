import java.util.Scanner;

public class calculadora {
public static void main(String[] args) {
System.out.println(".(Tabla de multiplicar)");
Scanner scanner = new Scanner(System.in);



System.out.print("Introduce un número: ");

        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 0; i <= 100; i++) {

            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

 }scanner.close();
}
}
