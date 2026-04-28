import java.util.Scanner;

public class nuevo3 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                        System.out.print("Introduce el tamaño de la matriz (n): ");
                int n = sc.nextInt();

                    int[][] matriz = new int[n][n];

                    System.out.println("Introduce los valores de la matriz:");
                        for (int i = 0; i < n; i++) {
                                for (int j = 0; j < n; j++) {
                                System.out.print("Elemento [" + i + "][" + j + "]: ");
                                 matriz[i][j] = sc.nextInt();
                            }
                        }

                        System.out.println("Matriz completa:");

                    for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                System.out.print(matriz[i][j] + "\t");
                            }
                            System.out.println();
                    }

                        int sumaDiagonalPrincipal = 0;
                System.out.println("Diagonal principal:");
                            for (int i = 0; i < n; i++) {
                                System.out.print(matriz[i][i] + " ");
                                sumaDiagonalPrincipal += matriz[i][i];
                            }
                System.out.println("Suma diagonal principal: " + sumaDiagonalPrincipal);

                        int sumaDiagonalSecundaria = 0;
                System.out.println("Diagonal secundaria:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(matriz[i][n - 1 - i] + " ");
                        sumaDiagonalSecundaria += matriz[i][n - 1 - i];
                    }
                System.out.println("Suma diagonal secundaria: " + sumaDiagonalSecundaria);

                sc.close();
            }
}