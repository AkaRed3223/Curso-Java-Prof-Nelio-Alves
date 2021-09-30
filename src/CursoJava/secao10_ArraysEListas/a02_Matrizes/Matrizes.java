package CursoJava.secao10_ArraysEListas.a02_Matrizes;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] matrix = new int[n][n]; //Matriz é um vetor bidimensional
        int cont = 0;

        for (int i = 0; i < n; i++) { //cada iteração criará um novo vetor
            for (int j = 0; j < n; j++) { //e dentro desse vetor, serão inseridos os elementos
                matrix[i][j] = input.nextInt();
                if (matrix[i][j] < 0) { //se o número inserido for menor que 0, incremente o contador
                    cont++;
                }
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " "); //mostrar a diagonal principal
        }

        System.out.println();
        System.out.println("Negative numbers = " + cont);

        input.close();

    }
}
