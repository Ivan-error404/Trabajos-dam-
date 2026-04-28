import java.util.Scanner;
import java.util.Scanner;

public class entergable3t4_2 {
    static int numAlumnos;

    static double totalBiologia = 0;
    static double totalFilosofia = 0;
    static double totalMatematicas = 0;

    static int alumnosSuspendidos = 0;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce el número de alumnos: ");
            numAlumnos = sc.nextInt();

            int contador = 1;
                while (contador <= numAlumnos) {
                    System.out.println("\n--- Alumno " + contador + " ---");

                    System.out.print("Nota de Biología: ");
                    double bio = sc.nextDouble();

                    System.out.print("Nota de Filosofía: ");
                    double filo = sc.nextDouble();

                    System.out.print("Nota de Matemáticas: ");
                    double mate = sc.nextDouble();

                
                    anadirNotas(bio, filo, mate);

                
                    double promedioAlumno = promedioAlumno(bio, filo, mate);
                    System.out.println("Promedio del alumno: " + promedioAlumno);

                    if (bio < 5 || filo < 5 || mate < 5) {
                        alumnosSuspendidos++;
                    }

                    contador++;
                }

        
            mostrarPromedioCurso();

        
            System.out.println("\nNúmero de alumnos con alguna asignatura suspendida: " + alumnosSuspendidos);

            sc.close();
        }


        public static void anadirNotas(double bio, double filo, double mate) {
            totalBiologia += bio;
            totalFilosofia += filo;
            totalMatematicas += mate;
        }


    public static double promedioAlumno(double bio, double filo, double mate) {
        return (bio + filo + mate) / 3.0;
    }


    public static void mostrarPromedioCurso() {
        System.out.println("\n=== Promedios del curso ===");
        System.out.println("Promedio Biología: " + (totalBiologia / numAlumnos));
        System.out.println("Promedio Filosofía: " + (totalFilosofia / numAlumnos));
        System.out.println("Promedio Matemáticas: " + (totalMatematicas / numAlumnos));
    }
}
