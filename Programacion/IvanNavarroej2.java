
 import java.util.Scanner; 
 public class IvanNavarroej2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int numeroSecreto = (int)(Math.random()*10)+1;
    int intento = 0; // este es el valor que el usuario después escribirá por teclado
    int cintentos=0;
    System.out.println("¡Bienvenido al juego de Adivina el Número!");
    System.out.println("He elegido un numero entre 1 y 10.");
        while (intento != numeroSecreto) {
        System.out.print("Introduce un numero: ");
        intento = sc.nextInt(); // leemos de teclado el numero del usuario
        cintentos ++ ;
        
        if (intento == numeroSecreto) {
System.out.println("ACERTASTE, el numero secreto es el " + 
numeroSecreto + "numero de intentos para sacar el numero " + cintentos );
} else {
System.out.println("FALLASTE,vuelve a intentarlo.");
}
}
sc.close();
}
}

    

