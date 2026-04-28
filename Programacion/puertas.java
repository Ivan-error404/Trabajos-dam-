import java.util.Scanner;

public class puertas{

    public static void main(String[] args)
     {
        System.out.println("Que clase social eres");
        System.out.println("Puertas disponibles");
        System.out.println("1 puerta ,Monarca");
        System.out.println("2 puerta,noble");
        System.out.println("3 puerta,limpiador");
        System.out.println("4 puerta , vecinos");
    
        
        Scanner puerrrta = new Scanner(System.in);

        int roja = 1;
        int azul =2;
        int verd =3;
        int morado =4;

        int Monarca =1;
        int noble =2;
        int limpiador =3;
        int vecinos =4;

        System.out.println("que puerta quieres");
        int Scanner = puerrrta.nextInt();

         System.out.println("que clase social eres");
        int clasismo= puerrrta.nextInt();

        puerrrta.close();
      if(Scanner == (1) && clasismo == (1)) {
System.out.println("entra");
      }
   else if(Scanner == (2) && clasismo == (2)) {
System.out.println("entra");
     }
    else  if(Scanner == (3) && clasismo == (3)) {
System.out.println("entra");
     }
 else if(Scanner == (4) && clasismo == (4)) {
System.out.println("entra");
     }
     else{
       System.out.println("tu clase no coincide ,pobre.");
     }
    }
  }