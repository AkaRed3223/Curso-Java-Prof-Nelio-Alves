package CursoJava.secao10_ArraysEListas.ex05_Matriz;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();
        int[][] matrix = new int[M][N]; //criação de matriz assimétrica

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = input.nextInt(); //input dos valores
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
            System.out.print("[" + matrix[i][j] + "]"); //mostrar os valores da matriz na tela
            System.out.println();
        }

        int x = input.nextInt(); //variável de verificação

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + "[" + matrix[i][j-1] + "]");
                    }
                    if (i > 0) {
                        System.out.println("Up: " + "[" + matrix[i-1][j] + "]");
                    }
                    if (j < N - 1) {
                        System.out.println("Right: " + "[" + matrix[i][j+1] + "]");
                    }
                    if (i < M - 1) {
                        System.out.println("Down: " + "[" + matrix[i+1][j] + "]");
                    }
                }
            }
        }
        input.close();
    }
}
