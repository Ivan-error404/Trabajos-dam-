public class Mavenproject14 {

    public static void main(String[] args) {

        int [] numeros = {3, 7, 2, 9, 4}; 
       
        for (int i = 0; i <= 4; i++)
            System.out.println("Indice"+1+":"  + numeros[i] );  
        
int minimo = Integer.MAX_VALUE;
int maximo = Integer.MIN_VALUE;

for (int num : numeros) {
    if (num < minimo) {
        minimo = num;
    }
    if (num > maximo) {
        maximo = num;
    }
}

System.out.println("Mínimo: " + minimo); // Mínimo: 1
System.out.println("Máximo: " + maximo); // Máximo: 9

        }
    }